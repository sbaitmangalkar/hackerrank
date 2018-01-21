package com.hackerrank.implementation.finddigits;

import java.util.Scanner;

public class DigitFinder {
	
	private static int findDigits(int inputNumber){
		int givenInput = inputNumber;
		int digitCounter = 0;
		while(inputNumber > 0){
			int digit = inputNumber % 10;
			if(digit <= 0){
				inputNumber = inputNumber / 10;
				continue;
			}
			if(givenInput % digit == 0){
				digitCounter++;
			}
			inputNumber = inputNumber / 10;
		}
		
		return digitCounter;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCaseCount = sc.nextInt();
		
		for(int i = 1; i <= testCaseCount; i++){
			int inputNumber = sc.nextInt();
			int result = findDigits(inputNumber);
			System.out.println(result);
		}
	}
}
