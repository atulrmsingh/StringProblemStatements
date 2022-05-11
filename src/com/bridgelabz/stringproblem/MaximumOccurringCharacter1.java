package com.bridgelabz.stringproblem;
import java.util.HashMap;
import java.util.Map;

public class MaximumOccurringCharacter1 {
	public static void findMaxOcc(String input) {

		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			if (hashMap.get(input.charAt(i)) != null) {
				hashMap.put(input.charAt(i), hashMap.get(input.charAt(i)) + 1);

			} else {
				hashMap.put(input.charAt(i), 1);
			}

		}
		hashMap.forEach((key, value) -> System.out.println(key + ":" + value));
		int maxCount = 0;
		char maximumOccurance = ' ';
		for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
			}
		}
		for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() == maxCount) {
				maximumOccurance = entry.getKey();
			}
		}
		System.out.println("Maximum occurring character is " + maximumOccurance);

	}

	public static void main(String[] args) {

		String input = "java";
		MaximumOccurringCharacter1.findMaxOcc(input);

	}

}
