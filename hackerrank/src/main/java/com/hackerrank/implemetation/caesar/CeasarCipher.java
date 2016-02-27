package com.hackerrank.implemetation.caesar;

import java.util.Arrays;

public class CeasarCipher {
	
	private static String cipherText(String input, int flipFactor){
		char[]finalChars = new char[input.length()];
		
		for(int i = 0; i < input.length(); i++){
			int asciiValueOfChar;
			char eachChar = input.charAt(i);
			String character = String.valueOf(eachChar);
			if(!character.matches("[a-zA-Z]")){
				finalChars[i] = eachChar;
				continue;
			}
			asciiValueOfChar = eachChar;
			
			int newChar = asciiValueOfChar + flipFactor;
			/*
			 * If lowercase 'z' is encountered, adding anything
			 * will make the ASCII to cross beyond 122. So the flipFactor
			 * is added to 96, a intermediate ASCII value. Now adding anything
			 * to 96 will circle back the character to 'a'.
			 */
			if(newChar > 122 && character.equals("z")){
				newChar = 96 + flipFactor;
			}
			/*
			 * If uppercase 'Z' is encountered, adding anything
			 * will make the ASCII to cross beyond 90. So the flipFactor
			 * is added to 64, a intermediate ASCII value. Now adding anything
			 * to 96 will circle back the character to 'A'.
			 */
			else if(newChar > 90 && newChar < 97 && character.equals("Z")){
				newChar = 64 + flipFactor;
			}
			char requiredChar = (char) newChar;
			finalChars[i] = requiredChar;
		}
		String cipherText = new String(finalChars);
		return cipherText;
	}
	
	public static void main(String[] args) {
		String input = "Hello_World!";
		int flipFactor = 4;
		
		/*char[]finalChars = new char[input.length()];
		
		for(int i = 0; i < input.length(); i++){
			int asciiValueOfChar;
			char eachChar = input.charAt(i);
			String character = String.valueOf(eachChar);
			if(!character.matches("[a-zA-Z]")){
				finalChars[i] = eachChar;
				continue;
			}
			asciiValueOfChar = eachChar;
			
			int newChar = asciiValueOfChar + flipFactor;
			if(newChar > 122 && character.equals("z")){
				newChar = 96 + flipFactor;
			}else if(newChar > 122 && character.equals("Z")){
				newChar = 64 + flipFactor;
			}
			char requiredChar = (char) newChar;
			finalChars[i] = requiredChar;
		}
		String s = new String(finalChars);
		System.out.println(s);*/
		
		String d = cipherText(input, flipFactor);
		System.out.println(d);
	}
}
