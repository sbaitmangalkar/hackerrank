package com.hackerrank.warmup.comparetriplets;

import java.util.Scanner;

public class CompareTheTriplets {
	private static void compareTriplets(int a0, int a1, int a2, int b0, int b1, int b2){
		int alicePoint = 0;
		int bobPoint = 0;
		if(a0 > b0){
			alicePoint++;
		}else if(b0 > a0){
			bobPoint++;
		}
		
		if(a1 > b1){
			alicePoint++;
		}else if(b1 > a1){
			bobPoint++;
		}
		
		if(a2 > b2){
			alicePoint++;
		}else if(b2 > a2){
			bobPoint++;
		}
		
		System.out.println(alicePoint + " " + bobPoint);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a0 = sc.nextInt();
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b0 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        compareTriplets(a0, a1, a2, b0, b1, b2);
		sc.close();
	}
}
