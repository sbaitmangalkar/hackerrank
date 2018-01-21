package com.hackerrank.bitmanipulation.lonelyint;

import java.util.Scanner;

public class LonelyInteger {
	private static int getLonelyInteger(int[] input){
		
		int lonely = 0;
		for(int i = 0; i < input.length; i++){
			lonely = lonely ^ input[i];
		}
		return lonely;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		int list[] = new int[arrayLength];
		
		for(int i = 0; i < arrayLength; i++){
			list[i] = sc.nextInt();
		}
		
		int lonely = getLonelyInteger(list);
		
		System.out.println(lonely);
		
	}
}
