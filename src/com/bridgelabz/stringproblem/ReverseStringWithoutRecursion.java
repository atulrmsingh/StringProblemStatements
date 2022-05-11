package com.bridgelabz.stringproblem;

public class ReverseStringWithoutRecursion {
	public static void main(String args[]) {
		String value = "abcd";

		System.out.print("After reverse string is: ");
		for (int i = value.length(); i > 0; --i) {
			System.out.print(value.charAt(i - 1));
		}
	}

}
