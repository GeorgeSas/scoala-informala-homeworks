package stringutilitypackage;

import java.util.Scanner;

public class UserInput {

	public String getUserInput() {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		return input;
		
	}

}
