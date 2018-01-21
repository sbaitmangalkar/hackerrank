package com.hackerrank.implementation.jumponcloud;

import java.util.Scanner;

public class JumpingOnTheCoulds {
	private static void findNumberOfJumps(int[] clouds){
		int startPos = 0;
		int endPos = clouds.length - 1;
		int jump = 0;
		while(startPos != endPos){
			if(startPos + 2 < clouds.length && clouds[startPos + 2] == 0){
				jump++;
				startPos = startPos + 2;
			}else if(clouds[startPos + 1] == 0){
				jump++;
				startPos = startPos + 1;
			}
		}
		System.out.println(jump);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]clouds = new int[n];
		for(int i = 0; i < n; i++){
			clouds[i] = sc.nextInt();
		}
		findNumberOfJumps(clouds);
		sc.close();
	}
}
