package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenRadius(0.005);
		//BACKGROUND
		StdDraw.setPenColor(255,255,191);
		StdDraw.filledRectangle(.5, .5, .45, .25);
		//ARCH TOP
		StdDraw.setPenColor(Color.LIGHT_GRAY);
		StdDraw.filledEllipse(.5, .28, .27, .4);
		//ARCH BOTTOM
		StdDraw.setPenColor(255,255,191);
		StdDraw.filledEllipse(.5, .23, .2, .4);
		//GRASS
		StdDraw.setPenColor(63,170,20);
		StdDraw.filledRectangle(.5, .2, .45, .125);
		//WATER
		StdDraw.setPenColor(0,71,171);
		StdDraw.filledRectangle(.5, .17, .45, .125);
		//SHORE
		StdDraw.setPenColor(63,170,20);
		for(double i = 0; i < 22 * .04; i = i + .04) {
			StdDraw.filledEllipse(.076 +  i, .3, .02, .02);
		}
		//BIRD 1
		StdDraw.setPenColor(196,30,58);
		StdDraw.filledEllipse(.2, .65, .02, .02);
		StdDraw.filledEllipse(.165, .65, .02, .02);
		StdDraw.setPenColor(255,255,191);
		StdDraw.filledEllipse(.2, .64, .02, .02);
		StdDraw.filledEllipse(.165, .64, .02, .02);
		//BIRD 2
		StdDraw.setPenColor(196,30,58);
		StdDraw.filledEllipse(.85, .45, .02, .02);
		StdDraw.filledEllipse(.815, .45, .02, .02);
		StdDraw.setPenColor(255,255,191);
		StdDraw.filledEllipse(.85, .44, .02, .02);
		StdDraw.filledEllipse(.815, .44, .02, .02);
		//Cleaning up bottom
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(.5, .125, 1, .125);
		//FLAG BORDER
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(.5, .5, .45, .25);
	}
}