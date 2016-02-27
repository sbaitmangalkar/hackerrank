package com.hackerrank.greedy.maxmin;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
	private static int computeMaxMin(int[] elements, int n, int k){
		Arrays.sort(elements);
		int unfairness = Integer.MAX_VALUE;
		int min;
		int max;
		for(int i = 0; i < n - k + 1; i++){
			min = elements[i];
			max = elements[i + k - 1];
			if((max - min) < unfairness){
				unfairness = max - min;
			}
		}
		return unfairness;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int k = Integer.parseInt(sc.nextLine());
		int elements[] = new int[n];
		for(int i = 0; i < n; i++){
			elements[i] = Integer.parseInt(sc.nextLine());
		}
		int res = computeMaxMin(elements, n, k);
		System.out.println(res);
		sc.close();
	}
}
