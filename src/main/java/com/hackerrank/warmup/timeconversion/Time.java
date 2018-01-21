package com.hackerrank.warmup.timeconversion;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("00");
		System.out.println("Enter time:");
		String timeStr = sc.nextLine();
		timeStr = timeStr.trim();
		
		String onlyTime[] = timeStr.split(":");
		
		int hour = Integer.parseInt(onlyTime[0]);
		if(hour < 12 && onlyTime[2].contains("PM")){
			hour += 12;
		}else if(hour == 12 && onlyTime[2].contains("AM")){
			hour = 0;
		}
		String secVal = onlyTime[2].substring(0, 2);
		String hourVal = String.valueOf(hour);
		
		hourVal = format.format(hour);
		String finalTime = hourVal + ":" + onlyTime[1] + ":" + secVal;
		
		System.out.println(finalTime);
	}
}
