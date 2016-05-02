/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class QuadraticFormula extends ConsoleProgram {
	
	
	private double a,b,c;
	
	public void run() {
		
		double discr,sol1,sol2;
		
		a = readDouble("Enter a: ");
		b = readDouble("Enter b: ");
		c = readDouble("Enter c: ");
		
		discr = b * b - 4 * a * c;
		discr = Math.sqrt(discr);
		sol1 = (-b + discr)/(2*a);
		sol2 = (-b - discr)/(2*a);
		
		if(discr > 0){
			println("There are two roots.");
			println("One root is " + sol1);
			println("One root is " + sol2);
		}else if( discr == 0){
			println("There is one root: " + sol1);
		}else{
			println("There are no real roots.");
		}
		
	}
}