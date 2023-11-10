package org.java;

import java.util.Scanner;

public class Snack4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Verifico se una parola è palindroma");
		System.out.print("Inserisci una parola: ");
		String word = in.nextLine();
		int wLen = word.length();

		
		boolean palindrome = true;
		
		for(int x = 0; x < wLen / 2; x++) {
			char w = word.charAt(x);
			char backW = word.charAt(wLen - 1 - x);
			
			if(w != backW) {
				palindrome = false;
				break;
			}
			
		}
		if (palindrome) System.out.println("La parola '" + word + "' è palindroma");
		else System.out.println("La parola '" + word + "' non è palindroma");
			
	}

}
