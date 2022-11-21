package Runner;

import businessLayer.MutantGenerator;
import businessLayer.SeperateWords;
import businessLayer.UrduSpellModel;
import databaseLayer.FileToDatabase;
import presentationLayer.UrduSpellController;
import presentationLayer.UrduSpellView;

public class UrduSpellCheckerRunner {
	public static void main(String[] args) {
		/*
		 * FileToDatabase objD = new FileToDatabase(); objD.readAllFile(); SeperateWords
		 * objS = new SeperateWords(); objS.sepWords();
		 */
		MutantGenerator mu = new MutantGenerator();
		mu.GenerateAndStore();
		UrduSpellView v = new UrduSpellView();
		v.setVisible(true);
		UrduSpellModel m = new UrduSpellModel();
		UrduSpellController c = new UrduSpellController(m, v);
		c.getStartController();
	}
}
