package org.java;

import java.util.Random;

public class Snack2 {

	public static void main(String[] args) {
		
		String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		
		int nLen = nomi.length;
		int cLen = cognomi.length;
		
		Random rnd = new Random();
		
		for(int x = 0; x < 10; x++) {
			String rndNome = nomi[rnd.nextInt(nLen)];
			String rndCognome = cognomi[rnd.nextInt(cLen)];
			System.out.println("Invitato N." + (x + 1) + " --> " + rndNome + " " + rndCognome);
		}
	}

}
