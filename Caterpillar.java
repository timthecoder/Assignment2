/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Caterpillar extends GraphicsProgram {
	/* TODO: You are probably going to want to define some program constants here that
	 * control the size, number, spacing, and color of the body segments. When you do,
	 * delete this comment and replace it with your constants.
	 * 
	 * Remember to add comments describing what each constant does!
	 */	
	private static final int RADIUS = 50;
	private static final Color DARK_GREEN = new Color(0,100,0);
	private static final int SEPARATION = 20;
	private static final int X_OFFSET = 35;
	private static final int Y_OFFSET = 40;
	public void run() {
		
		double xMark = 50;
		double yMark = 100;
		
		placeCaterpillar(xMark,yMark);
	}
	
	private void placeCaterpillar(double x, double y){
		
		//first segment
		GOval first = new GOval(x,y,2*RADIUS,2*RADIUS);
		first.setFilled(true);
		first.setFillColor(DARK_GREEN);
		first.setColor(Color.RED);
		add(first);
		
		//second segment
		GOval second = new GOval(x + X_OFFSET + SEPARATION,y - Y_OFFSET,2*RADIUS,2*RADIUS);
		second.setFilled(true);
		second.setFillColor(DARK_GREEN);
		second.setColor(Color.RED);
		add(second);
		
		//third segment
		GOval third = new GOval(x + 2*RADIUS + SEPARATION,y,2*RADIUS,2*RADIUS);
		third.setFilled(true);
		third.setFillColor(DARK_GREEN);
		third.setColor(Color.RED);
		add(third);
		
		
		//fourth segment
		GOval fourth = new GOval(x + 2 *RADIUS + SEPARATION + X_OFFSET + SEPARATION,y - Y_OFFSET,2*RADIUS,2*RADIUS);
		fourth.setFilled(true);
		fourth.setFillColor(DARK_GREEN);
		fourth.setColor(Color.RED);
		add(fourth);
		
		//fifth segment
		
		GOval fifth = new GOval(x + 2*(2*RADIUS + SEPARATION),y,2*RADIUS,2*RADIUS);
		fifth.setFilled(true);
		fifth.setFillColor(DARK_GREEN);
		fifth.setColor(Color.RED);
		add(fifth);
		//sixth segment
		GOval sixth = new GOval(x + 2*(2 *RADIUS + SEPARATION) + X_OFFSET + SEPARATION,y - Y_OFFSET,2*RADIUS,2*RADIUS);
		sixth.setFilled(true);
		sixth.setFillColor(DARK_GREEN);
		sixth.setColor(Color.RED);
		add(sixth);
	}
}
