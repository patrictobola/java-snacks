package org.java;

import java.util.Scanner;

public class Snack7 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Dammi un numero di secondi e te lo convertirò in ore: ");
		String strSeconds = in.nextLine();
		int intSeconds = Integer.valueOf(strSeconds);
		
//		Distinguo in base ai secondi ricevuti ore, minuti e secondi
		
		int hours = intSeconds / 3600;
		int minutes = (intSeconds % 3600) / 60;
		int seconds = intSeconds % 60;
		
		String result = String.format("%02d:%02d:%02d", hours, minutes, seconds);
		
		System.out.println("Il numero di secondi inseriti è: " + strSeconds + " --> " + result);
	}

}
