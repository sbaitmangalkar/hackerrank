package com.hackerrank.dynamicprog.coin;

import java.util.Scanner;

public class CoinChange {
	private static int max(int coins[], int n){
		int numCoins[] = new int[n + 1];
		numCoins[0] = 1;
		
		for(int i = 0; i < coins.length; i++){
			for(int j = coins[i]; j < numCoins.length; j++){
				numCoins[j] += numCoins[j - coins[i]];
			}
		}
		
		return numCoins[n];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] coins = new int[m];
		for(int i = 0; i < m; i++){
			coins[i] = sc.nextInt();
		}
		int res = max(coins, n);
		System.out.println(res);
		
		sc.close();
	}
}
