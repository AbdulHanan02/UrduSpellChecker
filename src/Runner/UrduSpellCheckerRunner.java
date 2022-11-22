package Runner;

import businessLayer.MutantGenerator;
import businessLayer.UrduSpellModel;
import presentationLayer.UrduSpellController;
import presentationLayer.UrduSpellView;
/**
 * 
 * @author AbdulHanan
 *
 */
public class UrduSpellCheckerRunner {
	public static void main(String[] args) {

		UrduSpellView v = new UrduSpellView();
		UrduSpellModel m = new UrduSpellModel();
		UrduSpellController c = new UrduSpellController(m, v);
		c.getStartController();
	}
}
