package com.bridgelabz.stringproblem;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(ReverseStringImpl.reverseString("spring boot"));
		System.out.println(ReverseStringImpl.reverseString("java is language"));
	}

}

class ReverseStringImpl {

	public static String reverseString(String str) {
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}
}
