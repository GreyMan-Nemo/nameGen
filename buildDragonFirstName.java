/* Name generator program,
 * This is a basic program to generate a name based on information supplied by a user
 *
 * Dragon first name generator
 * The following formula will be used to generate the first part of a user's dragon name
 * First two letters of birthMonth, 
 * Plus the first three letters from the first name,
 * Plus the second and third letters of the last name,
 * Plus the last three letters of randomWord1
 * 
 * @author: GreyMan-Nemo
 * @date:   03rd October 2019
 */

package nameGen;

public class BuildDragonFirstName {

	// Defining class fields
	private static String month;
	private static String nameFirst;
	private static String nameLast;
	private static String random1;
	
	private static String monthStr;
	private static String nameFirstStr;
	private static String nameLastStr;
	private static String random1Str;
	
	private static int random1StrCount;
	
	private static String dragonFirstNamePart1;
	private static String dragonFirstNamePart2;
	private static String dragonFirstName;
	
	// Creating buildDragonFirstName method
	public static String buildDragonFirstName() {
		
		month = SetDragonDetails.getMonth();
		nameFirst = SetDragonDetails.getFirstName();
		
		monthStr = month.substring( 0, 1);
		nameFirstStr = nameFirst.substring( 0, 2);
		dragonFirstNamePart1 = monthStr + nameFirstStr;
		dragonFirstNamePart1 = Character.toUpperCase( dragonFirstNamePart1.charAt( 0)) + dragonFirstNamePart1.substring( 1);
		
		nameLast = SetDragonDetails.getLastName();
		nameLastStr = nameLast.substring( 0, 2);
		
		random1 = SetDragonDetails.getRandomWord1();
		random1StrCount = random1.length();
		
		if( random1StrCount == 3) {
			random1Str = random1;
			
		} // Closing if statement
		
		else if( random1StrCount > 3) {
			random1Str = random1.substring( random1StrCount -3);
			
		} // Closing else if statement

		dragonFirstNamePart2 = nameLastStr + random1Str;
		dragonFirstName = dragonFirstNamePart1 + dragonFirstNamePart2;
		
		return dragonFirstName;
		
	} // Closing buildDragonFirstName method
} // Closing buildDragonFirstName
