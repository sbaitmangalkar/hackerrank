package com.hackerrank.strings.pangrams;

public class Pangram {
	private static final int LETTERS = 123;
	
	/**
	 * Checks if the input string is pangram.
	 * Runs in 3 O(n) time.
	 * 
	 * @param input
	 * @return
	 */
	private boolean checkPangram(String input){
		input = input.toLowerCase();
		boolean isPangram = true;
		/*
         * Create a temp buffer with size 123 which will be used
         * to flip positions of ASCII character.
         */
		int tempBuffer[] = new int[LETTERS];
		
		/*
         * Iterate through the input string and flip the
         * position in array which corresponds to ASCII of
         * particular character.
         */
		for(int i = 0; i < input.length(); i++){
			tempBuffer[input.charAt(i)]++;
		}
		
		/*
		 * For lower case letters, iterate only through
         * their ASCII codes and check if any character is 
         * upflipped. As the ASCII codes of lowercase letters
         * starts from 97 and ends at 122, where 97 being 'a'
         * and 122 being 'z'.
		 */
		
		for(int k = 97; k < 123; k++){
			if(tempBuffer[k] == 0){
				isPangram = false;
				break;
			}
		}
		
		return isPangram;
	}
	
	
	public static void main(String[] args) {
		Pangram p = new Pangram();
		boolean flag = p.checkPangram("We promptly judged antique ivory buckles for the next prize");
		if(flag){
			System.out.println("Pangram");
		}else{
			System.out.println("Not Pangram");
		}
	}
}
