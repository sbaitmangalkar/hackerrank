package com.hackerrank.implementation.chocolatefeast;

import java.util.Scanner;

public class Candy {
	    
	    private static long Solve(int N, int C, int M){
	       int purchased = N / C;
	       
	       int totalChocolates = purchased + chocolatesFromWrapper(purchased, M);
	       return totalChocolates; 
	    }
	    
	    private static int chocolatesFromWrapper(int chocolates, int M){
	    	int chocolatesGotFromWrapper = 0;
	    	while(chocolates / M > 0){
	    		chocolatesGotFromWrapper = chocolatesGotFromWrapper + chocolates / M;
	    		chocolates = (chocolates / M) + (chocolates % M);
	    	}
	    	return chocolatesGotFromWrapper;
	    }
	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int i = 0; i < t; i++){
	            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
	        }
	}
}
