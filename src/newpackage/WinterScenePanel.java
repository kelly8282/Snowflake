package newpackage;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class WinterScenePanel extends JPanel implements Runnable
{
	private List<AbstractShape> shapes;
	private AbstractShape sMan;
        private SnowMan dog;

	public WinterScenePanel()
	{
		setVisible(true);
                addKeyListener(this);
		//refer shapes to a new ArrayList of AbstractShape

		//populate the list with 50 unique snowflakes
                shapes = new ArrayList<AbstractShape>();
                for( int i = 0; i < 50; i ++)
                {
                    AbstractShape blank;
                    shapes.add(blank);
                }
		//instantiate a snowman
                dog = new SnowMan(100,100,20,20);

		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.BLUE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("MAKE A WINTER SCENE!",40,40);

		//make the snowman appear
                dog.draw(window);
		//make the snowflakes appear and move down the screen\
                for( int i = 0; i < shapes.size(); i ++)
                {
                    AbstractShape blank = shapes.get(i);
                    blank.draw(window);
                }
		//check to see if any of the snowflakes need to be reset to the top of the screen
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(35);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}