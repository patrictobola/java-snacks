package org.java;

public class snack8 {
	public static void main(String[] args) {
	
		String word = "Gabbiano";
		int wLen = word.length();
		
		
		String resultWord = "";
		
		for(int x = 0; x < wLen; x++) {
			char c = word.charAt(x);
			if(c == 'a') c = 'o';
			else if(c == 'o') c = 'a';
			resultWord += c;
		}
		
		
		System.out.println(resultWord);
		
		
	}
}
