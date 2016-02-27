package com.hackerrank.bitmanipulation.flippingbits;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FlipBits {
	
	private static long flipBits(long input){
		long result = ~input + 0x0000000100000000L;
		
		return result;
	}
	
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String maxValue = String.valueOf(Integer.MAX_VALUE);
		try{
			String num = reader.readLine();
			int testCaseCount = Integer.parseInt(num);
			
			
			for(int i = 1; i <= testCaseCount; i++){
				String in = reader.readLine();
				Integer input = null;
				try{
					input = Integer.parseInt(in);
					if(input == Integer.MAX_VALUE){
						System.out.println();
					}
				}catch(Exception e){
					System.out.println(maxValue);
					continue;
				}
				
				Long result = flipBits(input);
				System.out.println(result);
				
			}
			reader.close();
		}catch(Exception e){
			System.out.println("Oops!! Something went wrong!!");
			e.printStackTrace();
		}
		
	}
}
