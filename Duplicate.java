package samplecode;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {

	public static void main(String[] args) {
		
		// input = Test
		// output = t
		
	String str= "Test";
	Map<Character,Integer> mapChars = new HashMap<Character,Integer>();
	for(int i =0; i< str.length(); i++) {
		for(int j = i+1; j < str.length(); j++) {
			if(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)) {
				if (mapChars.get(str.toLowerCase().charAt(i)) != null) {
					Integer charVal = mapChars.get(str.toLowerCase().charAt(i));
					mapChars.put(str.toLowerCase().charAt(i), charVal + 1);
				} else {
					mapChars.put(str.toLowerCase().charAt(i), 1);
				}
			}
		}
	}
	
	int max = 0;
	Character character = null;
	for (Map.Entry<Character, Integer> entry : mapChars.entrySet())
    {
        if(max<entry.getValue()){
            max=entry.getValue();
            character=entry.getKey();
       }
    }
    System.out.println("Most frequent Character " + character);
  
}
	

}