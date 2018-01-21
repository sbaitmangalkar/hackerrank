package com.hackerrank.implementation.cavitymap;

import java.util.Scanner;

public class Cavity {
	private static final int MAX = 999;
	/**
	 * Finds cavity in the given maze.
	 * 
	 * @param maze
	 */
	private static void findCavity(int[][] maze) {
		for (int row = 1; row < maze.length - 1; row++) {
			for (int col = 1; col < maze.length - 1; col++) {
				if (maze[row][col] > maze[row][col + 1]
						&& maze[row][col] > maze[row + 1][col]
						&& maze[row][col] > maze[row - 1][col]
						&& maze[row][col] > maze[row][col - 1]) {
					/**
					 * Set the integer to MAX value.
					 */
					maze[row][col] = MAX;
				}
			}
		}

		printMaze(maze);
	}

	/**
	 * Prints the maze.
	 * 
	 * @param maze
	 */
	private static void printMaze(int[][] maze) {
		String cavityVal;
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				/*
				 * if value is equal to MAX, replace MAX with 'X'
				 */
				if (maze[i][j] == MAX) {
					cavityVal = "X";
					System.out.print(cavityVal);
					continue;
				}
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] maze = new int[size][size];

		for (int i = 0; i < size; i++) {
			String input = sc.next();
			for (int j = 0; j < input.length(); j++) {
				char inChar = input.charAt(j);
				maze[i][j] = Character.getNumericValue(inChar);
			}
		}

		findCavity(maze);
	}
}
