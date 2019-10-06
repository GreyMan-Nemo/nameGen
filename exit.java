/* Name generator program,
 * This is a basic program to generate a name based on information supplied by a user
 * 
 * Na-na-naaa-na,
 * Na-na-naaa-na,
 * Hay haaaaa-ay
 * Good-Bye
 * 
 * @author: GreyMan-Nemo
 * @date:   01st October 2019
 */
package nameGen;

public class Exit extends NameGenMenu{

	// Say good bye
	public static void exitProgram() {
	 	
		System.out.println( "Program Closing.....");
		System.out.println( "Good-Bye.....");
		
		kboard.close();
		
	} // Closing exitProgram method
} // Closing exit class
