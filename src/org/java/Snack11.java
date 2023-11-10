package org.java;

import java.util.Random;

import javax.print.attribute.standard.Media;

public class Snack11 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] rndNumbers = new int[10];
		int nLen = rndNumbers.length;
		
		
		for(int x = 0; x < nLen; x++) {
			rndNumbers[x] = rnd.nextInt(100);
		}
		
		
		int max = rndNumbers[0];
		int min = rndNumbers[0];
		int sum = 0;
		
		
		for(int x = 0; x < nLen; x++) {
			
			sum += rndNumbers[x];
			
			if(max < rndNumbers[x]) {
				max = rndNumbers[x];
			} else if (min > rndNumbers[x]) {
				min = rndNumbers[x];
			}
		}
		
		int avg = sum / nLen;
		
		
//		Anche se non necessario ho stampato prima tutti i numeri, poi il numero max, il min e la media per verificare che tutto fosse ok
		for(int x = 0; x < nLen; x++) {
			System.out.println("N." + (x + 1) + " " + rndNumbers[x]);
		}
		System.out.println("Numero più alto --> " + max);
		System.out.println("Numero più basso --> " + min);
		System.out.println("Media --> " + avg);
	}
}
