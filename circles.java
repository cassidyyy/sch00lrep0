package randomcircles;
import acm.program.*;
import acm.graphics.*;
import acm.util.*; 
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.Color;
import java.util.Random;

public class circles extends GraphicsProgram {
	
	private static final int CIRCLES = 10;
	
	private static final int MAX_RADIUS = 50;
	
	private static final int MIN_RADIUS = 5;
	
    private static final int SQUARES = 15;
	
	private static final int MAX_WIDTH = 50;
	
	private static final int MIN_WIDTH = 5;
	
    private static final int MAX_HEIGHT = 50;
	
	private static final int MIN_HEIGHT = 5;
	
	
	RandomGenerator r = new RandomGenerator();
	
	public void run() {
		
		for (int z = 0; z < CIRCLES; z++) {
			Color c = r.nextColor();
			int x = (int)(Math.random() * 550);
			int y = (int)(Math.random() * 500);
			int r = (int)(Math.random() * (MAX_RADIUS - MIN_RADIUS) + MIN_RADIUS);
			GOval circle = new GOval(x, y, r * 2, r * 2);
			circle.setFilled(true);
			circle.setColor(c);
			add(circle);
		}
		
		for (int a = 0; a < SQUARES; a++) {
			Color c = r.nextColor();
			int x = (int)(Math.random() * 450);
			int y = (int)(Math.random() * 300);
			int t = (int)(Math.random() * (MAX_HEIGHT - MIN_HEIGHT) + MIN_HEIGHT);
			GRect square = new GRect(x, y, t, t);
			square.setFilled(true);
			square.setColor(c);
			add(square);
			
		}
			
	  }
			
		
   }

