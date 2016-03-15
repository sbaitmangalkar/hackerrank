package com.hackerrank.bitmanipulation.countergame;

import java.math.BigInteger;
import java.util.Scanner;

public class CounterGame {
	private static void playCounterGame(BigInteger n){
		int lowestSetBits = n.getLowestSetBit();
		int bitCount = n.bitCount();
		int temp;
		if(lowestSetBits == 0){
			if(bitCount == 1){
				temp = 1;
			}else{
				temp = bitCount - 1;
			}
		}else{
			temp = (bitCount + lowestSetBits) - 1;
		}
		
		if(temp % 2 == 1){
			System.out.println("Louis");
		}else{
			System.out.println("Richard");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= testCases; i++){
			BigInteger n = new BigInteger(sc.nextLine());
			playCounterGame(n);
		}
		sc.close();
	}
}
