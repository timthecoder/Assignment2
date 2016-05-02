/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
import acm.graphics.*;

import java.awt.*;

public class IllusoryContours extends GraphicsProgram {
	/* The default width and height of the window. These constants will tell Java to
	 * create a window whose size is *approximately* given by these dimensions. You should
	 * not directly use these constants in your program; instead, use getWidth() and
	 * getHeight(), which return the *exact* width and height of the window.
	 */
	public static final int APPLICATION_WIDTH = 300;
	public static final int APPLICATION_HEIGHT = 300;
	private static final int RADIUS = 40;
	private static final int BOX_LENGTH = APPLICATION_WIDTH - 2*RADIUS;
	
	
	//to make the circle flushed to the bottom border.  different for each view
	private static final int Y_OFFSET = 0;
	private static final int X_OFFSET = 0;
	
	public void run() {
		placeCircles();
		placeBox();
	}
	
	private void placeCircles(){
		GOval circle1 = new GOval(0,0,2*RADIUS,2*RADIUS);
		circle1.setFilled(true);
		GOval circle2 = new GOval(APPLICATION_WIDTH-2*RADIUS-X_OFFSET,0,2*RADIUS,2*RADIUS);
		circle2.setFilled(true);
		GOval circle3 = new GOval(0,APPLICATION_HEIGHT-2*RADIUS-Y_OFFSET,2*RADIUS,2*RADIUS);
		circle3.setFilled(true);
		GOval circle4 = new GOval(APPLICATION_WIDTH-2*RADIUS-X_OFFSET,APPLICATION_HEIGHT-2*RADIUS-Y_OFFSET,2*RADIUS,2*RADIUS);
		circle4.setFilled(true);
		
		add(circle1);
		add(circle2);
		add(circle3);
		add(circle4);
		
	}
	
	private void placeBox(){
		GRect box = new GRect(RADIUS ,RADIUS ,BOX_LENGTH,BOX_LENGTH);
		box.setFilled(true);
		box.setColor(Color.WHITE);
		add(box);
	}
	
}
