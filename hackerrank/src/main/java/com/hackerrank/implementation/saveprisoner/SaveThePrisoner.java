package com.hackerrank.implementation.saveprisoner;

import java.util.Scanner;

public class SaveThePrisoner {
	/*
	 * Math logic
	 */
	private static int warnPrisoner(int noOfPrisoners, int mtotalSweets, int startPrisoner){
		int prisoner = (mtotalSweets + startPrisoner - 1) % noOfPrisoners;
		if(prisoner != 0){
			return prisoner;
		}else{
			return noOfPrisoners;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= testCases; i++){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int res = warnPrisoner(n, m, s);
			System.out.println(res);
		}
		sc.close();
	}
}
