package com.hackerrank.warmup.circularrotation;

import java.util.Scanner;

public class CircularArrayRotation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	    int k = in.nextInt();
	    int q = in.nextInt();
	    
	    int rotation = k % n;
	    
	    int[] elements = new int[n];
	    for(int i = 0; i < n; i ++){
	    	elements[i] = in.nextInt();
	    }
	    
	    for(int i = 0; i < q; i++){
	    	int query = in.nextInt();
	    	if(query - rotation >= 0){
	    		System.out.println(elements[query - rotation]);
	    	}else{
	    		System.out.println(elements[query - rotation + elements.length]);
	    	}
	    }
	    in.close();
	}
}
