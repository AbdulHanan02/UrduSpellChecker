package businessLayer;

import java.util.ArrayList;
import java.util.Iterator;

import databaseLayer.DatabaseForHighlightUC;

public class UrduSpellModel {

	DatabaseForHighlightUC dbLayer = new DatabaseForHighlightUC();
/**
 * 
 * @author Abdullah
 * Gets list of words from database
 */
	public ArrayList<String> GetWordsListFromDB() {
		dbLayer.createConnection();
		ArrayList<String> list = new ArrayList<String>();
		return dbLayer.GetWordsListFromDB();

	}
/**
 * 
 * @author Abdullah
 * Checks the entered words against provided words in the database 
 * 
 */
	public ArrayList<String> checkWords(ArrayList<String> wordsList, String[] words) {
		ArrayList<String> wrongList = new ArrayList<String>();
		boolean flag=false;
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			flag=false;
			for (Iterator iterator = wordsList.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				if (word.equals(string)) {
					flag=true;
				}
			}
			if(flag==false) {				
				wrongList.add(word);
			}
		}
		return wrongList;

	}

}
