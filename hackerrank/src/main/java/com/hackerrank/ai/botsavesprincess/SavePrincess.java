package com.hackerrank.ai.botsavesprincess;

import java.util.Scanner;

public class SavePrincess {
	private static void displayPathToPrincess(char[][] maze){
		int mx = 0;
		int my = 0;
		
		int px = 0;
		int py = 0;
		for(int row = 0; row < maze.length; row++){
			for(int col = 0; col < maze.length; col++){
				char pos = maze[row][col];
				if(pos != '-' && pos != 'p'){
					mx = row;
					my = col;
				}
				if(pos == 'p'){
					px = row;
					py = col;
				}
			}
		}
		
		if(mx < px){
			int dif = px - mx;
			while(dif > 0){
				System.out.println("DOWN");
				dif--;
			}
		}else if(mx > px){
			int dif = mx - px;
			while(dif > 0){
				System.out.println("UP");
				dif--;
			}
		}
		
		if(my < py){
			int dif = py - my;
			while(dif > 0){
				System.out.println("RIGHT");
				dif--;
			}
		}else if(my > py){
			int dif = my - py;
			while(dif > 0){
				System.out.println("LEFT");
				dif--;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rowAndCol = sc.nextInt();
		
		//String[][] maze = new String[rowAndCol][rowAndCol];
		char[][]maze = new char[rowAndCol][rowAndCol];
		
		for(int i = 0; i < rowAndCol; i++){
			String line = sc.next();
			for(int j = 0; j < line.length(); j++){
				maze[i][j] = line.charAt(j);
			}
		}
		/*for(int row = 0; row < maze.length; row++){
			for(int col = 0; col < maze.length; col++){
				maze[row][col] = sc.next();
			}
		}*/
		displayPathToPrincess(maze);
		
	}
}
