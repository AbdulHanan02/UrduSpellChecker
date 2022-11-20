package businessLayer;

import java.util.ArrayList;

import databaseLayer.DatabaseAccess;
import transferObject.TransferData;

public class SeperateWords {
	private String word;
	private int freq;
	private ArrayList<String> getData;
	private int indexx;

	public SeperateWords() {
		word = "";
		freq = 0;
		indexx = 0;
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
		this.indexx += 1;
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

	public void sepWords() {
		TransferData obj = new DatabaseAccess().fetchData();
		getData = obj.getObjS();
		ArrayList<SeperateWords> sep = new ArrayList<SeperateWords>();
		System.out.println("Seperation started");
		for (String s : getData) {
			String[] splitWord = s.split(" ");
			for (String wordd : splitWord) {
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

	}

}
