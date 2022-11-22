package businessLayer;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import databaseLayer.MutantDataAccess;
/**
 * 
 * @author Sharif
 *
 */

public class MutantGenerator {

	private char[][] mutantSet;

	public MutantGenerator() {
		mutantSet = new char[10][5];
		this.setGroup();
	}

	public List<String> mutantList(String word) {
		String wordForMutant = word;
		List<String> mutantsList = new ArrayList<>();//words in array list, then parsing through cases for mutants generation
		for (int count = 0; count < wordForMutant.length(); count++) {
			word = wordForMutant;
			switch (word.charAt(count)) {
			case 'ک':
			case 'ق':
				mutantsList = this.mutantLoop(mutantsList, word, wordForMutant, 0, count);
				break;
			case 'غ':
			case 'گ':
				mutantsList = this.mutantLoop(mutantsList, word, wordForMutant, 1, count);
				break;
			case 'ض':
			case 'ذ':
			case 'ز':
			case 'ظ':
				mutantsList = this.mutantLoop(mutantsList, word, wordForMutant, 2, count);
				break;
			case 'ڑ':
			case 'ڈ':
				mutantsList = this.mutantLoop(mutantsList, word, wordForMutant, 3, count);
				break;
			case 'ح':
			case 'ہ':
				mutantsList = this.mutantLoop(mutantsList, word, wordForMutant, 4, count);
				break;
			case 'ث':
			case 'س':
			case 'ص':
				mutantsList = this.mutantLoop(mutantsList, word, wordForMutant, 5, count);
				break;
			case 'ت':
			case 'ط':
				mutantsList = this.mutantLoop(mutantsList, word, wordForMutant, 6, count);
				break;
			case 'ع':
			case 'آ':
			case 'ا':
				mutantsList = this.mutantLoop(mutantsList, word, wordForMutant, 7, count);
				break;
			
			}

		}
		return mutantsList;
	}

	private void setGroup() {
		mutantSet[0][0] = 'ک';
		mutantSet[0][1] = 'ق';
		mutantSet[1][0] = 'غ';
		mutantSet[1][1] = 'گ';
		mutantSet[2][0] = 'ض';
		mutantSet[2][1] = 'ذ';
		mutantSet[2][2] = 'ز';
		mutantSet[2][3] = 'ظ';
		mutantSet[3][0] = 'ڑ';
		mutantSet[3][1] = 'ڈ';
		mutantSet[4][0] = 'ح';
		mutantSet[4][1] = 'ہ';
		mutantSet[5][0] = 'ث';
		mutantSet[5][1] = 'س';
		mutantSet[5][2] = 'ص';
		mutantSet[6][0] = 'ت';
		mutantSet[6][1] = 'ط';
		mutantSet[7][0] = 'ع';
		mutantSet[7][1] = 'آ';
		mutantSet[7][2] = 'ا';
	
	}

	public List<String> mutantLoop(List<String> temp, String mutant, String wordForMutant, int j, int k) {
		for (int i = 0; mutantSet[j][i] != '\0'; i++) {
			char[] charToCheck = mutant.toCharArray();
			charToCheck[k] = mutantSet[j][i];
			mutant = String.valueOf(charToCheck);
			if (!mutant.equals(wordForMutant))
				temp.add(mutant);
		}
		return temp;
	}

	public void GenerateAndStore() { //storing the generated mutants 
		MutantDataAccess objN = new MutantDataAccess();
		try {
			objN.genMutants();
		} catch (SQLException e) {

			System.out.println("Function Failed");
		}
		System.out.println("Mutants Generated");
	}

	public static void main(String[] args) {
		MutantGenerator ml = new MutantGenerator();
		ml.GenerateAndStore();

	}
}