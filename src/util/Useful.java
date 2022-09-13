package util;

import java.util.ArrayList;

public class Useful {

	public Useful() {
	}
	
	public static ArrayList<String> createAndGetArrayListOfIdentifiersStrings(String[] arrayIds) {
		ArrayList<String> ids = null;
		ids = new ArrayList<String>();
		for (int i = 0; i < arrayIds.length; i++) {
			ids.add(arrayIds[i]);
		}
		return ids;
	}

}
