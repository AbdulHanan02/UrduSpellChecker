package Runner;

import businessLayer.MutantGenerator;
import businessLayer.UrduSpellModel;
import presentationLayer.UrduSpellController;
import presentationLayer.UrduSpellView;
/**
 * 
 * @author Abdul Hanan
 *
 */
public class UrduSpellCheckerRunner {
	public static void main(String[] args) {

		//MutantGenerator mu = new MutantGenerator();
		//mu.GenerateAndStore();

		UrduSpellView v = new UrduSpellView();
		v.setVisible(true);
		UrduSpellModel m = new UrduSpellModel();
		UrduSpellController c = new UrduSpellController(m, v);
		c.getStartController();
	}
}
