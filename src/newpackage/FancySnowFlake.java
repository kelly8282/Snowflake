package newpackage;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a FancySnowFlake class

public class FancySnowFlake extends AbstractShape
{
   public FancySnowFlake(int x, int y, int w, int h )
   {
    super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
      window.setColor(getColor());
      int x = getXPos();
      int y = getYPos();
      int w = getWidth();
      int h = getHeight();
      int blank = w/2;
      int pov = h /2;
      //int abc = (int) Math.ceil(pov * .125);
      //int bcd = (int) Math.ceil(pov * .35);
      //int def = (int) Math.ceil(pov * .7);
      //int efg = (int) Math.ceil (blank * .125);
      //int fgh = (int) Math.ceil (blank * .35);
      //int hde = (int) Math.ceil (blank * .7);
      //int[] xCord = {x + hde, x + fgh, x + efg; x , x + efg, x + fgh, x+ hde, + x + blank / 2; x+ 
      
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}

