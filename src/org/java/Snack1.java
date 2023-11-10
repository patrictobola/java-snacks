package org.java;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		String value = in.nextLine();
		int digit = Integer.valueOf(value);
		
		if(digit % 2 == 0) System.out.println("Il numero inserito è paro ed è: " + digit);
		else System.out.println("Il numero inserito è disparo, verrà printato il primo numero paro successivo: " + (digit + 1));

	}

}
