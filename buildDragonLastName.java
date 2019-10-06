/* Name generator program,
 * This is a basic program to generate a name based on information supplied by a user
 *
 * Dragon second name generator
 * The following formula will be used to generate the first part of a user's dragon name
 * The last letter of mothersName,
 * Plus the first two letters of mothersName,
 * Plus the second and fourth letters of farthersName,
 * And the last three letters of both randomWord1 and randomWord2
 * 
 * @author: GreyMan-Nemo
 * @date:   04th October 2019
 */

package nameGen;

public class BuildDragonLastName {

	// Defining class fields
	private static String momName;
	private static int momNameCount;

	private static String momNameStr1;
	private static String momNameStr2;

	private static String dragonLastName;
	
	// Creating buildDragonThirdName method
	public static String buildDragonLastName() {
		
		momName = SetDragonDetails.getMothersName();
		momNameCount = momName.length();
		momNameStr1 = momName.substring( momNameCount -1);
		momNameStr2 = momName.substring( 0, 1);
		dragonLastName = momNameStr1 + momNameStr2;
		
		return dragonLastName;
		
	} // Closing buildDragonLastName method
} // Closing BuildDragonLastName method;
