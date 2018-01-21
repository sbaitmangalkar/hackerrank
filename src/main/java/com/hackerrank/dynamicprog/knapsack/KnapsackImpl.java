package com.hackerrank.dynamicprog.knapsack;

import java.util.Scanner;

/**
 * This solution may not be working completely.
 * 
 * @author Shyam
 *
 */
public class KnapsackImpl {
	private static int max(int a, int b){
		return a > b ? a : b;
	}
	
	private static int max(int a, int b, int c){
		return max(max(a,b), max(b,c));
	}
	
	public static int maxSum(int[]numbers, int n, int k){
		if(n <= 0 || k <= 0){
			return 0;
		}
		
		while(numbers[n - 1] > k){
			maxSum(numbers, n - 1, k);
		}
		
		return max((maxSum(numbers, n - 1, k)), (numbers[n - 1] + maxSum(numbers, n, k - numbers[n - 1])), (numbers[n - 1] + maxSum(numbers, n - 1, k - numbers[n - 1])));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= testCases; i++){
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int numbers[] = new int[n];
			for(int j = 0; j < n; j++){
				numbers[j] = sc.nextInt();
			}
			
			int result = maxSum(numbers, n, k);
			System.out.println(result);
		}
		sc.close();
	}
}
