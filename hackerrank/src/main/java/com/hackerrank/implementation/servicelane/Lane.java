package com.hackerrank.implementation.servicelane;

import java.util.Scanner;

public class Lane {
	
	private static int getMaxVehicle(int startIndex, int endIndex, int[] width){
		int bikeCount = 0;
		int carCount = 0;
		int truckCount = 0;
		for(int i = startIndex; i <= endIndex; i++){
			if(width[i] == 1){
				bikeCount++;
			}else if(width[i] == 2){
				carCount++;
				bikeCount++;
			}else if(width[i] == 3){
				truckCount++;
				carCount++;
				bikeCount++;
			}
		}
		
		if(bikeCount > carCount && bikeCount > truckCount){
			return 1;
		}else if(carCount >= bikeCount && carCount > truckCount){
			return 2;
		}else{
			return 3;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int testCaseCount = sc.nextInt();
		
		int[] width = new int[length];
		
		for(int i = 0; i < length; i++){
			width[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= testCaseCount; i++){
			int startIndex = sc.nextInt();
			int endIndex = sc.nextInt();
			
			int result = getMaxVehicle(startIndex, endIndex, width);
			System.out.println(result);
		}
	}
}
