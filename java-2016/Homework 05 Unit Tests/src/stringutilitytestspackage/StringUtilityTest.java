package stringutilitytestspackage;

import org.junit.Test;

import org.junit.Assert;
import stringutilitypackage.StringUtility;

/**
 * 
 * This class contains all the unit tests
 * written for the public methods which contain
 * the actual implementation of the string 
 * manipulator.
 * 
 * @author george.sas
 * 
 */
public class StringUtilityTest {

	@Test
	public void newLinesAreRemoved(){
		//given
		String stringUnderTest = "This is a string with a \n new line.";
		StringUtility strUtility = new StringUtility();
		//when
		String actualString = strUtility.removeAllWhiteSpaces(stringUnderTest);
		//then
		String expectedString = "Thisisastringwithanewline.";
		Assert.assertEquals(actualString, expectedString);
		
	}
	
	@Test
	public void tabsAreRemoved(){
		//given
		String stringUnderTest = "This is a string with a \t tab.";
		StringUtility strUtility = new StringUtility();
		//when
		String actualString = strUtility.removeAllWhiteSpaces(stringUnderTest);
		//then
		String expectedString = "Thisisastringwithatab.";
		Assert.assertEquals(actualString, expectedString);
		
	}
	
	@Test
	public void inputStringComposedOnlyOfTabsBecomesEmptyString(){
		//given
		String stringUnderTest = "\t \t \t";
		StringUtility strUtility = new StringUtility();
		//when
		String actualString = strUtility.removeAllWhiteSpaces(stringUnderTest);
		//then
		String expectedString = "";
		Assert.assertEquals(actualString, expectedString);
		
	}
	
	@Test
	public void inputStringComposedOnlyOfNewLinesBecomesEmptyString(){
		//given
		String stringUnderTest = "\n \n \n";
		StringUtility strUtility = new StringUtility();
		//when
		String actualString = strUtility.removeAllWhiteSpaces(stringUnderTest);
		//then
		String expectedString = "";
		Assert.assertEquals(actualString, expectedString);
		
	}
	
	@Test
	public void inputStringComposedOnlyOfTabsAndNewLinesBecomesEmptyString(){
		//given
		String stringUnderTest = "\n \n \t \t \n \t";
		StringUtility strUtility = new StringUtility();
		//when
		String actualString = strUtility.removeAllWhiteSpaces(stringUnderTest);
		//then
		String expectedString = "";
		Assert.assertEquals(actualString, expectedString);
		
	}
	
	@Test
	public void tabsAndNewLinesAreRemoved(){
		//given
		String stringUnderTest = "This is a string with a \t tab and a \n new line.";
		StringUtility strUtility = new StringUtility();
		//when
		String actualString = strUtility.removeAllWhiteSpaces(stringUnderTest);
		//then
		String expectedString = "Thisisastringwithatabandanewline.";
		Assert.assertEquals(actualString, expectedString);
		
	}
	
	@Test
	public void caseIsIgnoredWhenReplacingWordsWithNumbers(){
		//given
		String stringUnderTest = "Five FOUR One TWo thrEE";
		StringUtility strUtility = new StringUtility();
		//when
		String actualString = strUtility.replaceNumbersAsWordsWithNumericCounterParts(stringUnderTest);
		//then
		String expectedString = "5 4 1 2 3";
		Assert.assertEquals(actualString, expectedString);
		
	}
	
	@Test
	public void wordedNumbersPartOfLargerWordsAreIgnored(){
		//given
		String stringUnderTest = "One two twenty-two is the input.";
		StringUtility strUtility = new StringUtility();
		//when
		String actualString = strUtility.replaceNumbersAsWordsWithNumericCounterParts(stringUnderTest);
		//then
		String expectedString = "1 2 twenty-two is the input.";
		Assert.assertEquals(actualString, expectedString);
		
	}
	
	@Test
	public void stringsWithNoStandAloneWordedNumbersAreLeftAsTheyAre(){
		//given
		String stringUnderTest = "One-two twenty-two is threethree.";
		StringUtility strUtility = new StringUtility();
		//when
		String actualString = strUtility.replaceNumbersAsWordsWithNumericCounterParts(stringUnderTest);
		//then
		String expectedString = "One-two twenty-two is threethree.";
		Assert.assertEquals(actualString, expectedString);
		
	}
	
	@Test
	public void numericRepresentationInTheInputStringAreLeftAsTheyAre(){
		//given
		String stringUnderTest = "1 2 3 4 5 6";
		StringUtility strUtility = new StringUtility();
		//when
		String actualString = strUtility.replaceNumbersAsWordsWithNumericCounterParts(stringUnderTest);
		//then
		String expectedString = "1 2 3 4 5 6";
		Assert.assertEquals(actualString, expectedString);
		
	}
	
	@Test
	public void numberReplacementIsFunctionalWithTabsInTheInput(){
		//given
		String stringUnderTest = "One \t two twenty-two is the input.";
		StringUtility strUtility = new StringUtility();
		//when
		String actualString = strUtility.replaceNumbersAsWordsWithNumericCounterParts(stringUnderTest);
		//then
		String expectedString = "1 \t 2 twenty-two is the input.";
		Assert.assertEquals(actualString, expectedString);
		
	}
	
	@Test
	public void numberReplacementIsFunctionalWithNewLinesInTheInput(){
		//given
		String stringUnderTest = "One \n two twenty-two is the input.";
		StringUtility strUtility = new StringUtility();
		//when
		String actualString = strUtility.replaceNumbersAsWordsWithNumericCounterParts(stringUnderTest);
		//then
		String expectedString = "1 \n 2 twenty-two is the input.";
		Assert.assertEquals(actualString, expectedString);
		
	}
	
	@Test
	public void numberReplacementIsFunctionalWithTabsAndNewLinesInTheInput(){
		//given
		String stringUnderTest = "One \n \t two twenty-two is the input.";
		StringUtility strUtility = new StringUtility();
		//when
		String actualString = strUtility.replaceNumbersAsWordsWithNumericCounterParts(stringUnderTest);
		//then
		String expectedString = "1 \n \t 2 twenty-two is the input.";
		Assert.assertEquals(actualString, expectedString);
		
	}
	

	
}
