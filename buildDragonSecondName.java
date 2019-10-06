/* Name generator program,
 * This is a basic program to generate a name based on information supplied by a user
 *
 * Dragon second name generator
 * The following formula will be used to generate the first part of a user's dragon name
 * The last two letters of randomWord2, 
 * Plus the first three letters of randomWord2,
 * Plus the Second, third and fourth letters of farthersName,
 * 
 * @author: GreyMan-Nemo
 * @date:   04th October 2019
 */

package nameGen;

public class BuildDragonSecondName {

	// Defining class fields
	private static String dadName;
	private static String random2;
	
	private static String dadNameStr;
	private static String randomStr1;
	private static String randomStr2;
	
	private static String dragonSecondNamePart1;
	private static String dragonSecondName;
	
	private static int randomStrCount;
	
	// Adding buildDragonSecondName method
	public static String buildDragonSecondName() {
		
		random2 = SetDragonDetails.getRandomWord2();
		dadName = SetDragonDetails.getFarthersName();
		
		dadNameStr = dadName.substring( 1, 3);
		randomStr1 = random2.substring( 0, 2);
		randomStrCount = random2.length();
		
		if( randomStrCount == 2) {
			randomStr2 = random2;
			
		} // Closing if statement
		
		else if( randomStrCount > 2) {
			randomStr2 = random2.substring( randomStrCount -2);
			
		} // Closing else if statement
		
		dragonSecondNamePart1 = randomStr1 + dadNameStr;
		dragonSecondNamePart1 = Character.toUpperCase( dragonSecondNamePart1.charAt( 0)) + dragonSecondNamePart1.substring( 1);
		
		dragonSecondName = dragonSecondNamePart1 + randomStr2;
		
		return dragonSecondName;
		
	} // Closing buildDragonSecondName
} // Closing BuildDragonSecondName
