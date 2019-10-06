/* Name generator program,
 * This is a basic program to generate a name based on information supplied by a user
 * 
 * This file will hold a "switcher" class
 * it will be the responsibility of this file to take the user input supplied at the menu
 * and with the use of an switch case call the correct name generator elements
 * 
 * @author: GreyMan-Nemo
 * @date:   01st October 2019
 */

package nameGen;

// Extending Switcher class on NameGenMenu to inherit Scanner
public class Switcher {

	// SwitchThis, method is 
	public static void switchThis() {
		
		int option;
		option = NameGenMenu.input;
		
		switch( option) {
			case 1:
				DisplayStarWarsName.displayName();
					break;
				
			case 2:
				DisplayDragonName.displayThatName();
					break;
				
			case 0:
				Exit.exitProgram();
					break;
				
		} // Closing Switch/case 
	} // Closing switchThis method
} // Closing Switcher class
