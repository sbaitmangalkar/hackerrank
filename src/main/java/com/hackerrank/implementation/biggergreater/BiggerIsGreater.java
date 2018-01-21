package com.hackerrank.implementation.biggergreater;

import java.util.Scanner;

public class BiggerIsGreater {
	/*
	 * Unsolved
	 */
	private static void findSmallestLexicographicalString(String inputStr){
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= testCases; i++){
			String inputStr = sc.nextLine();
			findSmallestLexicographicalString(inputStr);
		}
		sc.close();
	}
}
