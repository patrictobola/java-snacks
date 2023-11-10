package org.java;

public class Snack3 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		int nLen = numbers.length;
		
		int sum = 0;
		for(int x = 1; x <= nLen - 1; x += 2) {
			
//			syso commentato per verificare che effettivamente stesse iterando nell'indici giusti
//			System.out.println("Nella posizione " + x + " dell'array c'è il numero " + numbers[x]);
			
			sum += numbers[x];
		}
		System.out.println(sum);
		
	}

}
