package com.hackerrank.implementation.matrixrotation;

import java.util.Scanner;

/**
 * This solution may not be completely working.
 * 
 * @author Shyam
 *
 */
public class RotateMatrix {
	private static void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static int[][] rotate(int[][] matrix, int numOfRotations){
		int[][] resultMatrix = matrix;
		int n = matrix[0].length;
		int m = matrix.length;
		
		for(int r = 0; r < numOfRotations; r++){
			for(int row = 0; row < n; ++row){
				for(int col = 0; col < m; ++col){
					if(col == row && row < (n / 2)){
						resultMatrix[col][row] = matrix[col][row + 1];
					}else if(col == row && row >= (n / 2)){
						resultMatrix[col][row] = matrix[col][row - 1];
					}else if((col == (m-row-1)) && row >= (n/2)){
						resultMatrix[col][row] = matrix[col + 1][row];
					}/*else if ((col == (m-row-1))) {
						resultMatrix[col][row] = matrix[col - 1][row];
					}*/
				}
			}
		}
		
		return resultMatrix;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String parametersLine = sc.nextLine();
		String parameters[] = parametersLine.split(" ");
		int m = Integer.parseInt(parameters[0]);
		int n = Integer.parseInt(parameters[1]);
		int numOfRotations = Integer.parseInt(parameters[2]);
		
		int[][] matrix = new int[m][n];
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		int[][] result = rotate(matrix, numOfRotations);
		printMatrix(result);
		sc.close();
	}
}
