package com.bridgelabz.stringproblem;

import java.util.Arrays;

public class MaximumOccurringCharacter {
	public static void main(String[] args) {
		String value = "java";
		char charArray[] = value.toCharArray();
		Arrays.sort(charArray);
		String s = new String(charArray);
		int n = s.length();
		int max_count = 0;
		int count = 1;
		char ans = ' ';
		for (int i = 1; i <= n; i++) {
			if ((i == n) || (s.charAt(i) != s.charAt(i - 1))) {
				if (max_count < count) {
					max_count = count;
					ans = s.charAt(i - 1);
				}
				count = 1;
			} else {
				count++;
			}
		}
		System.out.println("Maximum occurring character is " + ans);
	}
}
