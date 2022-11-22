package testcases;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import businessLayer.UrduSpellModel;
/**
 * 
 * @author Abdullah
 * Test cases for the functionality
 *
 */

public class HighlightTest {
	@Test
	void checkWords() {
    UrduSpellModel objm=new  UrduSpellModel();
    ArrayList<String> cword = objm.GetWordsListFromDB();
    Assertions.assertEquals(cword,objm.GetWordsListFromDB());
}
	@Test
	void checkWords2() {
    UrduSpellModel objm=new  UrduSpellModel();
    ArrayList<String> cword = null;
    Assertions.assertNotEquals(cword,objm.GetWordsListFromDB());
}
	@Test
	void CorrectWordsHighlight() {
    UrduSpellModel objm=new  UrduSpellModel();
    ArrayList<String> cword = objm.GetWordsListFromDB();
    String line = "پڑھتاہوں";
    String linelist [] = line.split(" "); 
    ArrayList<String> r = null;
    Assertions.assertNotEquals(r,objm.verifyWords(cword, linelist));
	}
	
	@Test
	void CorrectWordHighlight2() {
	UrduSpellModel objm=new  UrduSpellModel();
    ArrayList<String> cword = objm.GetWordsListFromDB();
    String line = "پڑھتاہوں";
    String linelist [] = line.split(" ");   		
    ArrayList<String> r = objm.verifyWords(cword, linelist );
    Assertions.assertEquals(r,objm.verifyWords(cword, linelist));
	}

	
}
