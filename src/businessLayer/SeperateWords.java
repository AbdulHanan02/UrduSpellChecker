package businessLayer;

import java.util.ArrayList;

import databaseLayer.DatabaseAccess;
import databaseLayer.FileToDatabase;
import transferObject.TransferData;

/**
 * 
 * @author Abdul Hanan
 *
 * class to get data and seperate words and save words in database
 */
public class SeperateWords {
	private String word;
	private int freq;
	private ArrayList<String> getData;
	public SeperateWords() {
		word = "";
		freq = 0;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq() {
		this.freq += 1;
	}

	public boolean searchWord(ArrayList<SeperateWords> a, String s) {
		for (SeperateWords s1 : a) {
			if (s1 == null) {
				return false;
			}
			if (s.equals(s1.getWord())) {
				s1.setFreq();
				return true;
			}
		}
		return false;
	}
	public void setFileData() {
		FileToDatabase objD = new FileToDatabase();
		objD.readAllFile();
		System.out.println("Files complete");
	}
	public void sepWords() {
		TransferData obj = new DatabaseAccess().fetchData();
		if(obj.getObjS()==null)
			return;
		getData = obj.getObjS();
		
		ArrayList<SeperateWords> sep = new ArrayList<SeperateWords>();
		System.out.println("Seperation started");
		for (String s : getData) {
			String[] splitWord = s.split(" ");
			for (String wordd : splitWord) {
				wordd=wordd.replaceAll("(?U)[\\W_]+", " ");
				if (this.searchWord(sep, wordd)) {
					
				} else {
					SeperateWords sw = new SeperateWords();
					sw.setWord(wordd);
					sw.setFreq();
					sep.add(sw);
				}
			}

		}
		DatabaseAccess objD = new DatabaseAccess();
		for (SeperateWords s : sep) {
			objD.insertWord(s.getWord(), s.getFreq());
		}
		System.out.println("Seperation ended");
	}

}
