package testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import businessLayer.SeperateWords;
import databaseLayer.DatabaseAccess;
import databaseLayer.FileToDatabase;

class TestUC1 {

	@Test
	void testFileDataReturnTrue() {
		DatabaseAccess db = new DatabaseAccess();
		Assertions.assertTrue(db.insertData("test", "test", "test"));
	}
	@Test
	void testInsertWord() {
		DatabaseAccess db = new DatabaseAccess();
		Assertions.assertTrue(db.insertWord("test", 1));
	}
	@Test
	void testReadXMLFile() {
		FileToDatabase fdb = new FileToDatabase();
		
		Assertions.assertFalse(fdb.readXMLFile(null));
	}
	
	@Test
	void testFreq() {
		SeperateWords sw =new SeperateWords();
		Assertions.assertEquals(0, sw.getFreq());
	}
	@Test
	void testWord() {
		SeperateWords sw =new SeperateWords();
		Assertions.assertEquals(0, sw.getFreq());
	}
	
}
