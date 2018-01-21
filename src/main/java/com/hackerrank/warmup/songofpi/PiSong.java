package com.hackerrank.warmup.songofpi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PiSong {
	private static boolean checkSong(String song){
		boolean isPiSong = false;
		String pi = "31415926535897932384626433833";
		
		String eachWord[] = song.split(" ");
		for(int i = 0; i < eachWord.length; i++){
			eachWord[i] = eachWord[i].replaceAll("[^a-zA-Z]", "");
			if(eachWord[i].length() != Integer.parseInt(Character.toString(pi.charAt(i)))){
				isPiSong = false;
				break;
			}else{
				isPiSong = true;
			}
		}
		
		return isPiSong;
	}
	
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String cases = reader.readLine();
			int testCaseCount = Integer.parseInt(cases);
			for(int i = 1; i <= testCaseCount; i++){
				String song = reader.readLine();
				boolean isPiSong = checkSong(song);
				
				if(isPiSong){
					System.out.println("It's a pi song.");
				}else{
					System.out.println("It's not a pi song.");
				}
			}
			reader.close();
		}catch(Exception e){
			System.out.println("Error Occurred!!");
		}
	}
}
