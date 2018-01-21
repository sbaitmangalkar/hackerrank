package com.hackerrank.implementation.divisiblesumpair;

import java.util.Scanner;

public class DivisibleSumPair {
	private static int countPairs(int[] elements, int k){
		int pairCount = 0;
		for(int i = 0; i < elements.length; i++){
			for(int j = i + 1; j < elements.length; j++){
				if((elements[i] + elements[j]) % k == 0){
					pairCount++;
				}
			}
		}
		return pairCount;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] elements = new int[n];
		for(int i = 0; i < n; i++){
			elements[i] = sc.nextInt();
		}
		int pairs = countPairs(elements, k);
		System.out.println(pairs);
		sc.close();
	}
}
