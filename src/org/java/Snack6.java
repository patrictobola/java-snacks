package org.java;

public class Snack6 {

	public static void main(String[] args) {

		String numbers = "250";
		int nLen = numbers.length();
		
		int result = 0;
		
		for	(int x = 0; x < nLen; x++) {
			char c = numbers.charAt(x);
			if (c >= '0' && c <= '9') {
				int number = c - '0';
				result = result * 10 + number;
			}
		}
		
		System.out.println("Integer --> " + result);
		System.out.println("String --> " + numbers);
		
	}

}
