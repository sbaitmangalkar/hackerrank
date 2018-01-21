package com.hackerrank.implementation.gridsearch;

import java.util.Scanner;

public class GridSearch {
	
	private static boolean searchGrid(String[] grid, String[] pattern){
		boolean isFound = false;
		String beginPattern = pattern[0];
		int foundCount = 0;
		/*for(int i = 0; i < grid.length; i++){
			if(grid[i].contains(beginPattern)){
				for(int j = 1; j < pattern.length; j++){
					if(grid[i + 1].contains(pattern[j])){
						isFound = true;
						
					}else{
						isFound = false;
					}
				}
			}
		}*/
		for(int i = 0; i < pattern.length; i++){
			for(int j = 0; j < grid.length; j++){
				if(grid[j].contains(pattern[i])){
					foundCount++;
				}
			}
		}
		if(foundCount == pattern.length){
			isFound = true;
		}
		return isFound;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCaseCount = sc.nextInt();
		
		for(int i = 1; i <= testCaseCount; i++){
			int gridRow = sc.nextInt();
			int gridCol = sc.nextInt();
			String[] grid = new String[gridRow];
			for(int row = 0; row < grid.length; row++){
				grid[row] = sc.next();
			}
			
			int patternRow = sc.nextInt();
			int patternCol = sc.nextInt();
			String[] pattern = new String[patternRow];
			for(int pRow = 0; pRow < pattern.length; pRow++){
				pattern[pRow] = sc.next();
			}
			
			boolean isFound = searchGrid(grid, pattern);
			if(isFound){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}
