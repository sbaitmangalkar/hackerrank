package com.hackerrank.implementation.sherlockq;

import java.util.Scanner;

public class SherlockSquare {
	 private static int getPerfectSquareCount(int number1, int number2){
	        int perfectSquareCount = 0;
	        
	        int startNumber = (int)Math.ceil(Math.sqrt(number1));
	        int endNumber = (int)Math.ceil(Math.sqrt(number2));
	        
	        perfectSquareCount = endNumber - startNumber; 
	        return perfectSquareCount;
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int testCaseCount = sc.nextInt();
        
        for(int i = 1; i <= testCaseCount; i++){
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            int result = getPerfectSquareCount(number1, number2);
            System.out.println(result);
        }
	}
}
