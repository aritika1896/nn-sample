package samplecode;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Programming";
		Map<Character,Integer> mapChars = new HashMap<Character,Integer>();
		for(int i =0; i< str.length(); i++) {
			if (mapChars.get(str.toLowerCase().charAt(i)) == null) {
				mapChars.put(str.toLowerCase().charAt(i), 1);
			} else {
				Integer charVal = mapChars.get(str.toLowerCase().charAt(i));
				mapChars.put(str.toLowerCase().charAt(i), charVal + 1);
			}
		}
		
		//System.out.println("Map values " + mapChars);
		for (Map.Entry<Character, Integer> entry : mapChars.entrySet())
	    {
	        if (entry.getValue() >= 2) {
	        	System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }
	    
	}
}


