/* Name generator program,
 * This is a basic program to generate a name based on information supplied by a user
 *
 * StarWars name generator
 * Rumour has it (on the Internet) that George Lucas has a formula for creating the names of the characters in Star Wars,
 * this formula goes something like this..
 * 
 * To generate your Star Wars first name:
 * Take the first three letters of your last name
 * Add to the first two letters of your first name
 * 
 * To generate your Star Wars surname:
 * Take the first two letter of your mother's maiden name
 * Add to the first three letters of your place of birth.
 * 
 * @author: GreyMan-Nemo
 * @date:   02nd October 2019
 */

package nameGen;

public class BuildSWarsName {

	// Defining class field(s)
	private static String sWarsFirstName;
	private static String sWarsLastName;
	
	private static String firstName;
	private static String lastName;
	private static String maidenName;
	private static String birthPlace;
	
	private static String sWarsFirstNameStart;
	private static String sWarsFirstNameEnd;
	private static String sWarsLastNameStart;
	private static String sWarsLastNameEnd;
	
	
	// Method Added it is, build first name it will
	public static String buildFirstName() {
		
		firstName = SetStarWarsDetails.getFirstName();
		lastName = SetStarWarsDetails.getLastName();
		
		sWarsFirstNameStart = lastName.substring( 0, 3);
		sWarsFirstNameEnd = firstName.substring( 0, 2);
		sWarsFirstName = sWarsFirstNameStart + sWarsFirstNameEnd;
		sWarsFirstName = Character.toUpperCase( sWarsFirstName.charAt( 0)) + sWarsFirstName.substring( 1);
				
		return sWarsFirstName;
		
	} // Done it's job it has, close it will now

	
	// New method it is, last name, build it will
	public static String buildLastName() {
		
		maidenName = SetStarWarsDetails.getMaidenName();
		birthPlace = SetStarWarsDetails.getBirthPlace();
		
		sWarsLastNameStart = maidenName.substring( 0, 2);
		sWarsLastNameEnd = birthPlace.substring( 0, 3);
		sWarsLastName = sWarsLastNameStart + sWarsLastNameEnd;
		sWarsLastName = Character.toUpperCase( sWarsLastName.charAt( 0)) + sWarsLastName.substring( 1);
			
		return sWarsLastName;
		
	} // Last name you have, method now, close it has
} // Closing BuildSWarsName method
