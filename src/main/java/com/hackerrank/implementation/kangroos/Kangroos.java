package com.hackerrank.implementation.kangroos;

import java.util.Scanner;

public class Kangroos {
	private static boolean checkIfKangroosMeet(int x1, int v1, int x2, int v2){
		if((x2 - x1) * (v2 - v1) < 0 && (x2 - x1) % (v2 - v1) == 0){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean isMeeting = checkIfKangroosMeet(x1, v1, x2, v2);
        if(isMeeting){
        	System.out.println("YES");
        }else{
        	System.out.println("NO");
        }
        in.close();
	}
}
