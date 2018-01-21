package com.hackerrank.implementation.cutstick;

import java.util.Scanner;

public class CutStick {
	
	private static int getMinElement(int[] input){
		int min = input[0];
		for(int i = 1; i < input.length; i++){
			if(input[i] < min){
				min = input[i];
			}
		}
		return min;
	}
	
	private static void cutStick(int[] input){
		int min = getMinElement(input);
		
		int sticksCut = 0;
		for(int i = 0; i < input.length; i++){
			input[i] = input[i] - min;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCount = sc.nextInt();
		int input[] = new int[numCount];
		for(int i = 0; i < numCount; i++){
			input[i] = sc.nextInt();
		}
		cutStick(input);
	}
}
