package com.hackerrank.warmup.diagonaldiff;

import java.util.Scanner;

public class DiagonalDifference {
	
	 private static int getDiagonalDifference(int input[][]){
	        int firstDiagonalSum = 0;
	        int secondDiagonalSum = 0;
	        int n = input.length;
	        
	        int i = 0;
	        int j = 0;
	       
	        while(j < n){
	        	while(i < n){
	        		firstDiagonalSum += input[i][j];
	        		j++;
	        		break;
	        	}
	        	i++;
	        }
	        
	       i = 0;
	        while(j > 0){
	        	while(i < n){
	        		secondDiagonalSum += input[i][j - 1];
	        		j--;
	        		break;
	        	}
	        	i++;
	        }
	        
	        
	        int diagonalDifference = 0;
	        if(firstDiagonalSum > secondDiagonalSum){
	        	diagonalDifference = firstDiagonalSum - secondDiagonalSum;
	        }else{
	        	diagonalDifference = secondDiagonalSum - firstDiagonalSum;
	        }
	        return diagonalDifference;
	    }
	
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
	       //int n = Integer.parseInt(sc.nextLine());
	       int matrix[][] = new int[][]{
	    		   {11,2,4},
	    		   {4,5,6},
	    		   {10,8,-12}
	       };
	       
	        /*for(int i = 0; i < n; i++){
	            for(int j = 0; j < n; j++){
	            	int inputNumber = sc.nextInt();
	                matrix[i][j] = inputNumber;
	                System.out.println();
	            }
	        }*/
	        
	        int result = getDiagonalDifference(matrix);
	        System.out.println(result);
	}
}
