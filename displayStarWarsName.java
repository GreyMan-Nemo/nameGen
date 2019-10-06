/* Name generator program,
 * This is a basic program to generate a name based on information supplied by a user
 * 
 * This class file will call the other files to collect the required data
 * this data (constructed star wars name) will then be displayed to the user
 * 
 * @author: GreyMan-Nemo
 * @date:   03rd October 2019
 */

package nameGen;

public class DisplayStarWarsName {

	private static String f_name;
	private static String l_name;
	
	// Display name, you will
	public static void displayName() {
		
		f_name = BuildSWarsName.buildFirstName();
		l_name = BuildSWarsName.buildLastName();
		
		System.out.println( "");
		System.out.println( "Your Star Wars name is: "+ f_name +" "+ l_name);
		
		NameGenMenu.main( null);
		
	} // Do or do not, there is no try (but now the method will close)
} // Closing DisplayName class
