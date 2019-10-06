/* Name generator program,
 * This is a basic program to generate a name based on information supplied by a user
 * 
 * This file will contain the "getDragonDetails" class
 * it will be the responsibility of this file to get the required details from the user
 * these details will be stored in class fields 
 * 
 * @author: GreyMan-Nemo
 * @date:   03rd October 2019
 */

package nameGen;

public class SetDragonDetails extends NameGenMenu {

	// Defining class fields
	private static String colour;
	private static String birthMonth;
	private static String firstName;
	private static String lastName;
	private static String mothersName;
	private static String farthersName;
	private static String randomWord1;
	private static String randomWord2;
	
	
// Setter and getter for "colour"
	public static void setColour() {
		
		System.out.println( "");
		System.out.println( "Chooce a colour.......");
			colour = kboard.next();
		
	} // Closing setColour method
	
	public static String getColour() {
		
		setColour();
		return colour;
		
	} // Closing getColour method
	
	
// Setter and getter for "birthMonth"
	public static void setMonth() {
		
		System.out.println( "");
		System.out.println( "Your month of birth?");
		birthMonth = kboard.next();
		
	} // Closing setMonth method
	
	public static String getMonth() {
		
		setMonth();
		return birthMonth;
		
	} // Closing getMonth method
	
	
// Setter and getter for firstName
	public static void setFirstName() {
		
		System.out.println( "");
		System.out.println( "What is your first name?");
		firstName = kboard.next();
		
	} // Closing setFirstName method
	
	public static String getFirstName() {
		
		setFirstName();
		return firstName;
		
	} // Closing getFirstName method
	
	
// Setter and getter for "lastName"
	public static void setLastName() {
		
		System.out.println( "");
		System.out.println( "What is your last name?");
		lastName = kboard.next();
		
	} // Closing setLastName
	
	public static String getLastName() {
		
		setLastName();
		return lastName;
		
	} // Closing lastName method
	
	
// Setter and getter for "mothersName"
	public static void setMothersName() {
		
		System.out.println( "");
		System.out.println( "What is your  Mother's name?");
		mothersName = kboard.next();
		
	} // Closing setMothersName method
	
	public static String getMothersName() {
		
		setMothersName();
		return mothersName;
		
	} // Closing getMothersName method
	
	
// Setter and getter for "FarthersName"
	public static void setFarthersName() {
		
		System.out.println( "");
		System.out.println( "What is your Farther's name?");
		farthersName = kboard.next();
		
	} // Closing setFarthersName method
	
	public static String getFarthersName() {
		
		setFarthersName();
		return farthersName;
		
	} // Closing getFarthersName method
	
	
// Setter and getter for "randomWord1"
	public static void setRandomWord1() {
		
		System.out.println( "");
		System.out.println( "Choose a random word...... ");
		randomWord1 = kboard.next();
		
	} // Closing setRandomWord1
	
	public static String getRandomWord1() {
		
		setRandomWord1();
		return randomWord1;
		
	} // Closing getRandomWord1
	
	
// Setter and getter for "randomWord2"
	public static void setRandomWord2() {
		
		System.out.println( "");
		System.out.println( "Choose a second random word.........");
		randomWord2 = kboard.next();
		
	} // Closing setRandomWord2 method
	
	public static String getRandomWord2() {
		
		setRandomWord2();
		return randomWord2;
		
	} // Closing getRandomWord2 method
} // Closing setDagonDetails
