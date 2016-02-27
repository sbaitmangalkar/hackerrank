package com.hackerrank.strings.funnystrings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FunnyString {
	private static String reverseString(String input){
		char[] inputChars = input.toCharArray();
		for(int i = 0; i < inputChars.length / 2; i++){
			char temp = inputChars[i];
			inputChars[i] = inputChars[inputChars.length - 1 - i];
			inputChars[inputChars.length - 1 - i] = temp;
		}
		
		String revString = new String(inputChars);
		return revString;
	}
	
	private static boolean isFunnyString(String input){
		String revInput = reverseString(input);
		boolean isFunny = false;
		for(int i = 1; i < input.length(); i++){
			
			int inputDif = Math.abs(input.charAt(i) - input.charAt(i - 1));
			int revInputDif = Math.abs(revInput.charAt(i) - revInput.charAt(i - 1));
			
			if(inputDif == revInputDif){
				isFunny = true;
			}else{
				isFunny = false;
				break;
			}
		}
		return isFunny;
	}
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int testCaseCount = sc.nextInt();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String testCase = reader.readLine();
			int testCaseCount = Integer.parseInt(testCase);
			for(int i = 1; i <= testCaseCount; i++){
				String input = reader.readLine();
				boolean isFunny = isFunnyString(input);
				if(isFunny){
					System.out.println("Funny");
				}else{
					System.out.println("Not Funny");
				}
			}
			reader.close();
		}catch(Exception e){
			System.out.println("Something F***ed up real bad!!");
		}
		
	}
}
