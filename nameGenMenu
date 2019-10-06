/* Name generator program,
 * This is a basic program to generate a name based on information supplied by a user
 * 
 * The instructions for this task are to create a "Star Wars" name following the same formula that Mr. Lucas used to create character names
 * However, this can be expanded.
 * Firstly a menu would have to be created to allow for the choice of formula used
 * this would then call the applicable java file containing the desired name generator formula/format
 * 
 * @author: GreyMan-Nemo
 * @date:   01st October 2019
 * 
 */

package nameGen;

// Importing required module(s)
import java.util.Scanner;

public class NameGenMenu {

	// Initialising imported modules
	static Scanner kboard = new Scanner( System.in);
	
	// Defining method variable(s)
	static int input;
	
	public static void main( String[] Args) {
	
		// Display the menu
		System.out.println( "Welcome to Name Generator.");
		System.out.println( "                  		   ");
		System.out.println( "*********| MENU |*********");
		System.out.println( "Star Wars..............[1]");
		System.out.println( "Dragon.................[2]");
		System.out.println( " 			   			   ");	
		System.out.println( "Quit...................[0]");
		System.out.println( " 			   			   ");		
	
		input = kboard.nextInt();
		
		Switcher.switchThis();
		
	} // Closing main method
} // Closing NameGenMenu class
