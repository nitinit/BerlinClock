package com.ubs.opsit.romanNumber;

import java.util.TreeMap;

public class RomanNumber {
	static TreeMap<Integer, String> romanIntegerMap = new TreeMap<Integer, String>();
	
	static {
		romanIntegerMap.put(1, "I");
		romanIntegerMap.put(4, "IV");
		romanIntegerMap.put(5, "V");
		romanIntegerMap.put(9, "IX");
		romanIntegerMap.put(10, "X");
		romanIntegerMap.put(50, "L");
		romanIntegerMap.put(100, "C");
		romanIntegerMap.put(500, "D");		
		romanIntegerMap.put(1000, "M");
	}
	
	public String convert(int number) {
		int floorKey = romanIntegerMap.floorKey(number);
			
		if (floorKey == number) {
			return romanIntegerMap.get(number);
		}
		
		return romanIntegerMap.get(floorKey) + convert(number - floorKey);
	}

//	private String convertRoman(int number) {
//		String romanString = "";
//		if (number < 4) {
//			romanString = String.join("", Collections.nCopies(number, romanIntegerMap.get(1)));
//		} else if (number == 4) { 
//			romanString = romanIntegerMap.get(1) + romanIntegerMap.get(5);	
//		} else if (number > 5 && number < 9) {
//			romanString = romanIntegerMap.get(5) + String.join("", Collections.nCopies(number-5, romanIntegerMap.get(1)));
//		}
//		return romanString;
//	}

}
