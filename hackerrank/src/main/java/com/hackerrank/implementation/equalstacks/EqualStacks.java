package com.hackerrank.implementation.equalstacks;

import java.util.Scanner;

public class EqualStacks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int[] cylinders = {n1, n2, n3};
		
		int[][] stack = {new int[n1], new int[n2], new int[n3]};
		int[] height = {0, 0, 0};
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < cylinders[i]; j++){
				int cylinderHeight = sc.nextInt();
				stack[i][j] = cylinderHeight;
				height[i] = height[i] + cylinderHeight;
			}
		}
		
		int[] index = {0, 0, 0};
		int targetHeight = Math.min(Math.min(height[0], height[1]), height[2]);
		
		while(height[0] != height[1] || height[1] != height[2]){
			for(int i = 0; i < 3; i++){
				if(height[i] > targetHeight){
					height[i] = height[i] - stack[i][index[i]++];
					targetHeight = Math.min(targetHeight, height[i]);
				}
			}
		}
		System.out.println(targetHeight);
		sc.close();
	}
}
