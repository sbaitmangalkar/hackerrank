package com.hackerrank.implementation.nondivsubsets;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonDivisibleSubsets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Map<Integer, Integer> frequency = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int mod = sc.nextInt() % k;
			if (frequency.containsKey(mod)){
				frequency.put(mod, frequency.get(mod) + 1);
			}else{
				frequency.put(mod, 1);
			}
		}
		int count = n;
		if (frequency.containsKey(0)){
			count = count - frequency.get(0) + 1;
		}
		if (k % 2 == 0) {
			if (frequency.containsKey(k / 2)){
				count = count - frequency.get(k / 2) + 1;
			}
			for (int j = 1; j < k / 2; j++) {
				int m = k - j;
				if (frequency.containsKey(m) && frequency.containsKey(j)){
					count = count - Math.min(frequency.get(m), frequency.get(j));
				}
			}
		} else {
			for (int j = 1; j <= k / 2; j++) {
				int m = k - j;
				if (frequency.containsKey(m) && frequency.containsKey(j)){
					count = count - Math.min(frequency.get(m), frequency.get(j));
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
