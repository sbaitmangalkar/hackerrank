package com.hackerrank.warmup.staircase;


public class Stairs {
	 public static void main(String[] args) {
		int n = 5;
		
		
		for(int i = n; i > 0; i--){
			StringBuilder sb = new StringBuilder();
			for (int p = 0; p < i; p++) {
				if(p != 0)
	            sb.append(" ");
	        }
	        for (int q = 0; q <= (n - i); q++) {
	            sb.append("#");
	        }
	        System.out.println(sb);
			
		}
	}
}
