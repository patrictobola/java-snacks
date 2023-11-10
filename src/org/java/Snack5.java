package org.java;

import java.util.Scanner;

public class Snack5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
				
//		Apro un ciclo infinito che si stoppa solo se invio "0"
		while (true) {			
		System.out.print("[0 per uscire] Inserisci una o più parole: ");
		String phrase = in.nextLine();

		if (phrase.equals("0"))	break;
		
		int pLen = phrase.length();

//		variabili contatore
		int digits = 0;
		int letters = 0;
		int others = 0;
		
		for(int x = 0; x < pLen; x++) {
			char c = phrase.charAt(x);
			if (Character.isDigit(c)) digits++;
			else if (Character.isLetter(c)) letters++;
			else others++;
		}
		
		System.out.println("Nelle parole che ci hai dato ci sono:");
		System.out.println("N." + digits + " di numeri");
		System.out.println("N." + letters + " di lettere");
		System.out.println("N." + others + " di caratteri non alfanumerici");
		}
		
		in.close();
	}

}
