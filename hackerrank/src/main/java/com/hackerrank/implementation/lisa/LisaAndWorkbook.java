package com.hackerrank.implementation.lisa;

import java.util.Scanner;

public class LisaAndWorkbook {
	private static void findSpecialProblems(int maxPage, int chapter, int[] chapters){
		int pageNumber = 0;
		int special = 0;
		
		for(int i = 0; i < chapter; i++){
			int problem = chapters[i];
			pageNumber++;
			
			for(int j = 1; j <= problem; j++){
				if((j - 1) % maxPage == 0 && j != 1){
					pageNumber++;
				}
				if(pageNumber == j){
					special++;
				}
			}
		}
		System.out.println(special);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chapter = sc.nextInt();
		int maxPage = sc.nextInt();
		int[] chapters = new int[chapter];
		
		for(int i = 0; i < chapter; i++){
			chapters[i] = sc.nextInt();
		}
		findSpecialProblems(maxPage, chapter, chapters);
		sc.close();
	}
}
