package DrawingAFace;

import acm.program.GraphicsProgram;
import java.awt.Color;
import acm.graphics.*;

public class robotFace extends GraphicsProgram {
	
	private static final int HEAD_WIDTH = 150;
	
	private static final int HEAD_HEIGHT = 250;
	
	private static final int EYE_RADIUS = 10;
	
	private static final int MOUTH_WIDTH = 60;
	
	private static final int MOUTH_HEIGHT = 20;
	
	public void run() {
		
		double cx = getWidth()/2;
		double cy = getHeight()/2;
		
		
		GRect head = new GRect(cx - HEAD_WIDTH/2, cy - HEAD_HEIGHT/2, HEAD_WIDTH, HEAD_HEIGHT);
		head.setColor(Color.BLACK);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
		
		GRect mouth = new GRect(cx - MOUTH_WIDTH/2, cy + MOUTH_HEIGHT/4, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setColor(Color.WHITE);
		mouth.setFilled(true);
		add(mouth);
		
	   GOval eye1 = new GOval(cx - HEAD_WIDTH/4, cy - HEAD_HEIGHT/4, EYE_RADIUS, EYE_RADIUS);
	   eye1.setColor(Color.YELLOW);
	   eye1.setFilled(true);
	   add(eye1);
	   
	   GOval eye2 = new GOval(cx + HEAD_WIDTH/4, cy - HEAD_HEIGHT/4, EYE_RADIUS, EYE_RADIUS);
	   eye2.setColor(Color.YELLOW);
	   eye2.setFilled(true);
	   add(eye2);
		
		
		
		
	}

}
