package stringutilitypackage;

/**
 * 
 * This class contains the actual
 * implementation of the string
 * manipulator.
 * 
 * A total of two methods:
 * <p><b> - removeAllWhiteSpaces()<b></p>
 * <p><b> - replaceNumbersAsWordsWithNumericCounterParts()<b></p>
 * 
 */
public class StringUtility {

	
	/**
	 * 
	 * This methods removes whitespace, new lines, tabs from a
	 * string provided by the user via the keyboard
	 * 
	 * @param usrInput actual input provided by the user from the keyword
	 * @return the modified string (without whitespace, new lines or tabs) 
	 */
	public String removeAllWhiteSpaces(String usrInput) {

		usrInput = usrInput.replaceAll("\\s+", "");
		System.out.println(usrInput);
		return usrInput;

	}

	/**
	 * 
	 * This methods replaces all the worded numbers 
	 * (numbers from 0 to 9 represented as words) with their numeric
	 * counterparts as long as said numbers are not part of a larger word.
	 * 
	 * @param usrInput actual input provided by the user from the keyword
	 * @return the modified string (numbers as words replaced by numerics) 
	 */
	public String replaceNumbersAsWordsWithNumericCounterParts(String userInput) {

		String[] list = userInput.split(" ");
		String phrase = "";

		for (String word : list) {

			switch (word.toLowerCase()) {
			case "zero":
				phrase += 0;
				break;
			case "one":
				phrase += 1;
				break;
			case "two":
				phrase += 2;
				break;
			case "three":
				phrase += 3;
				break;
			case "four":
				phrase += 4;
				break;
			case "five":
				phrase += 5;
				break;
			case "six":
				phrase += 6;
				break;
			case "seven":
				phrase += 7;
				break;
			case "eight":
				phrase += 8;
				break;
			case "nine":
				phrase += 9;
				break;

			default:
				phrase += word;
			}
			phrase += " ";
		}
		System.out.println(phrase.substring(0, phrase.length() - 1));
		
		return phrase.substring(0, phrase.length() - 1);
	}

}
