package org.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Scegli il primo numero: ");
		String value1 = in.nextLine();
		int n1 = Integer.valueOf(value1);
			
		System.out.print("Scegli il secondo numero: ");
		String value2 = in.nextLine();
		int n2 = Integer.valueOf(value2);
		
		int result = 0;
		
		if (n1 < n2) {
            for (int x = n1; x <= n2; x++) {
                result += x;
            }
        } else {
            for (int x = n2; x <= n1; x++) {
                result += x;
            }
        }
		System.out.println(result);
	}
}
