/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class TricolorFlag extends GraphicsProgram {
	/* The width and height of the flag. Many flags have an aspect ratio of 3:2 and
	 * our choice of constants here assumes this. Feel free to change these constants
	 * if you're drawing a flag with a different aspect ratio.
	 */
	private static final double FLAG_WIDTH  = 300;
	private static final double FLAG_HEIGHT = 200;
	
	//one bar width
	private static final double STRIP = FLAG_WIDTH /3;
	private static final Color CARDINAL_RED = new Color(196,30,58);
	
	
	public void run() {
		
		//centers the flag to the middle
		double xMark = getWidth() / 2 - FLAG_WIDTH /2;
		double yMark = getHeight()/ 2 - FLAG_HEIGHT /2;
		
	placeFlag(xMark,yMark);	
	placeLabel();
	}
	
	
	private void placeFlag(double x , double y){
		
		//black bar
		GRect blackBar = new GRect( x , y, STRIP, FLAG_HEIGHT );
		blackBar.setFilled(true);
		blackBar.setColor(Color.BLACK);
		add(blackBar);
		
		//yellow bar
		GRect yellowBar = new GRect( x + STRIP, y, STRIP, FLAG_HEIGHT );
		yellowBar.setFilled(true);
		yellowBar.setColor(Color.YELLOW);
		add(yellowBar);
		
		//cardinal red bar
		GRect cardBar = new GRect( x + 2* STRIP, y, STRIP, FLAG_HEIGHT );
		cardBar.setFilled(true);
		cardBar.setColor(CARDINAL_RED);
		add(cardBar);
		
	}
	
	private void placeLabel(){
		
		GLabel label = new GLabel("Flag of Belgium" );
		label.setFont("SANS_SERIF-30");
		label.setLocation(getWidth() - label.getWidth(), getHeight()-label.getHeight());
		add(label);
	}
}
