package Runner;

import businessLayer.UrduSpellModel;
import presentationLayer.UrduSpellController;
import presentationLayer.UrduSpellView;

public class UrduSpellCheckerRunner {
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		UrduSpellView v = new UrduSpellView();
		v.setVisible(true);
		UrduSpellModel m = new UrduSpellModel();
		UrduSpellController c = new UrduSpellController(m, v);
		c.getStartController();
	}
}
