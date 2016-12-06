package stringutilitypackage;

/**
 * 
 * Application implements a string
 * manipulator which either removes
 * all whitespace, tabs and newlines 
 * or replaces all the numbers (0-9) 
 * represented as words with their numeric
 * counterparts.
 * 
 * @author george.sas
 * @since 2016-12-06
 * @version 1.2
 */
public class Main {

	public static void main(String[] args) {

		StringUtility strUtility = new StringUtility();

		// Get user input
		UserInput input = new UserInput();
		String userInput = input.getUserInput();

		// Remove all whitespace
		strUtility.removeAllWhiteSpaces(userInput);

		// Replace written (or worded) numbers with their numeric counterparts
		strUtility.replaceNumbersAsWordsWithNumericCounterParts(userInput);

	}

}
