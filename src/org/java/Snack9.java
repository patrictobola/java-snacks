package org.java;

import java.util.ArrayList;

public class Snack9 {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int nLen = numbers.length;
		
//		Ho trovato su google questi array dove si può gestire dinamicamente la dimensione 
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		
		
		for(int x = 0; x < nLen; x++) {
			if(numbers[x] % 2 == 0) even.add(numbers[x]);
			else odd.add(numbers[x]);
		}
		System.out.println(even);
	}

}
