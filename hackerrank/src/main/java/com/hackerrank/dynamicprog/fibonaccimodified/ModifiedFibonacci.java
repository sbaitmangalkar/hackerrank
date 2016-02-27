package com.hackerrank.dynamicprog.fibonaccimodified;

import java.math.BigInteger;
import java.util.Scanner;

public class ModifiedFibonacci {
	
	private static void computeFibonacci(int a, int b, int n){
		int c = 0;
		BigInteger n3 = new BigInteger(String.valueOf(c));
		BigInteger n1 = new BigInteger(String.valueOf(a));
		BigInteger n2 = new BigInteger(String.valueOf(b));
		//System.out.print(n1 + " " + n2);
		int nthTerm = 2;
		for(int i = 2; i <= n; i++){
			n3 = n2.multiply(n2).add(n1);
			n1 = n2;
			n2 = n3;
			nthTerm++;
			
			//System.out.print(" " + n3);
			
			if(nthTerm == n){
				break;
			}
		}
		System.out.println(n3);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		computeFibonacci(a, b, n);
	}
}
