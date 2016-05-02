/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
import acm.graphics.*;

public class BoxesIllusion extends GraphicsProgram {
	/* The number of rows and columns in the grid, respectively. */
	private static final int NUM_ROWS = 5;
	private static final int NUM_COLS = 6;
	
	/* The width and height of each box. */
	private static final double BOX_SIZE = 40;
	
	/* The horizontal and vertical spacing between the boxes. */
	private static final double BOX_SPACING = 10;
	
	/* The default width and height of the window. These constants will tell Java to
	 * create a window whose size is *approximately* given by these dimensions. You should
	 * not directly use these constants in your program; instead, use getWidth() and
	 * getHeight().
	 */
	public static final int APPLICATION_WIDTH = 350;
	public static final int APPLICATION_HEIGHT = 300;

	public void run() {
		
		double xMark = getWidth()/2 - (NUM_COLS * BOX_SIZE + (NUM_COLS - 1) * BOX_SPACING)/2;
		double yMark = getHeight()/2 -(NUM_ROWS * BOX_SIZE + (NUM_ROWS - 1) * BOX_SPACING)/2 ;
		
		placeIllusion(xMark,yMark);
	}
	
	
	private void placeIllusion(double x, double y){
		
		for(int row = 0; row < NUM_ROWS; row++ ){
			
			
			for( int col = 0; col < NUM_COLS; col++){
				
				
				GRect box = new GRect(x+ col * (BOX_SIZE + BOX_SPACING) ,y+ row * (BOX_SIZE + BOX_SPACING),
						BOX_SIZE,BOX_SIZE);
				box.setFilled(true);
				add(box);
			}
		}
		
	}
}
