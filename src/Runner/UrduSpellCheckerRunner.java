package Runner;

import businessLayer.UrduSpellModel;
import presentationLayer.ManualAdd;
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
		ManualAdd v2 = new ManualAdd();
		UrduSpellModel m = new UrduSpellModel();
		UrduSpellController c = new UrduSpellController(m, v,v2);
		c.getStartController();
	}
}
