package transferObject;

import java.util.ArrayList;

/**
 * 
 * @author Abdul Hanan
 * 
 * class to transfer data from dal to bl
 *
 */

public class TransferData {
	private ArrayList<String> objS;
	
	public TransferData() {
		objS= new ArrayList<String>();
	}
	
	public void setData(String s) {
		objS.add(s);
	}

	public ArrayList<String> getObjS() {
		return objS;
	}
	
}
