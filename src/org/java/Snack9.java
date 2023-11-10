package org.java;

public class Snack9 {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int nLen = numbers.length;

		int[] even = new int[10];
		int[] odd = new int[10];
		
		
		int evenIndex = 0;
		int oddIndex = 0;
		
		
		 for (int x = 0; x < nLen; x++) {
	            if (numbers[x] % 2 == 0) {
	                even[evenIndex] = numbers[x];
	                evenIndex++;
	            } else {
	                odd[oddIndex] = numbers[x];
	                oddIndex++;
	            }
	        }
		System.out.println(odd[1]);
	}

}
