package transferObject;

import java.util.ArrayList;

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
