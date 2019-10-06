/* Name generator program,
 * This is a basic program to generate a name based on information supplied by a user
 * 
 * This file will contain the "getStarWarsDetails" class
 * it will be the responsibility of this file to get the required details from the user
 * these details will be stored in class fields 
 * 
 * @author: GreyMan-Nemo
 * @date:   01st October 2019
 */

package nameGen;

public class SetStarWarsDetails extends NameGenMenu {
	
	// Defining class fields
	private static String first_name;
	private static String last_name;
	private static String maiden_name;
	private static String birth_place;
	
	
// Setter and getter for user's first name
	public static void setFirstName() {
		
		System.out.println( "");
		System.out.println( "Please provide your first name.....");
		first_name = kboard.next();
		 
	} // Closing setFirstName
	
	public static String getFirstName() {	
		setFirstName();
		return first_name;
	}
	

// Set and getter for user's last name
	public static String setLastName() {
		
		System.out.println( "");
		System.out.println( "Please provide your last name.....");
		last_name = kboard.next();
	
		return last_name;
		
	} // Closing setLastName
	
	public static String getLastName() {
		setLastName();
		return last_name;
	}
	
	
// Setter and getter for user's mother's maiden name
	public static void setMaidenName() {
		
		System.out.println( "");
		System.out.println( "Please provide your Mother's maiden name.....");
		maiden_name = kboard.next();
			
	} // Closing setMaidenName
	
	public static String getMaidenName() {
		setMaidenName();
		return maiden_name;
	}
	
	
// Get user's place of birth
	public static void setBirthPlace() {
		System.out.println( "");
		System.out.println( "Please provide you place of birth.....");
		birth_place = kboard.next();
		
	} // Closing setBirthPlace
	
	public static String getBirthPlace() {
		setBirthPlace();
		return birth_place;
	}
} // Closing AboutNameGen
