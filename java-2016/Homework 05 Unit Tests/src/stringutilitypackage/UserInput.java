package stringutilitypackage;

import java.util.Scanner;

/**
 * 
 * This class takes an input
 * provided by the user via the
 * keyboard
 * 
 * @author george.sas
 *
 */
public class UserInput {

	public String getUserInput() {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		return input;
		
	}

}
