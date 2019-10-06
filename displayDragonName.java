/* Name generator program,
 * This is a basic program to generate a name based on information supplied by a user
 * 
 * This class file will call the other files to collect the required data
 * this data (constructed Dragon name) will then be displayed to the user
 * 
 * @author: GreyMan-Nemo
 * @date:   04th October 2019
 */

package nameGen;

public class DisplayDragonName extends NameGenMenu {

	private static String colour;
	private static String f_name;
	private static String m_name;
	private static String l_name;
	
	// Please excuse the naming of things - in pub, good pints, good tunes
	public static void displayThatName() {
		
		colour = SetDragonDetails.getColour();
		f_name = BuildDragonFirstName.buildDragonFirstName();
		m_name = BuildDragonSecondName.buildDragonSecondName();
		l_name = BuildDragonLastName.buildDragonLastName();
		
		
		System.out.println( "Your Dragon name is "+ colour +" "+ f_name +" "+ m_name +" "+l_name);
		
		NameGenMenu.main( null);
		
	} // Closing displayThatName method
} // Closing DisplayDragonName
