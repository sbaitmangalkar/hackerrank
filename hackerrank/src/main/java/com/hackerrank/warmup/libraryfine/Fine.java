package com.hackerrank.warmup.libraryfine;

import java.util.Arrays;

public class Fine {
	public static void main(String[] args) {
		String actualReturn = "9 6 2015";
		String expectedReturn = "6 6 2015";
		int fine = 0;

		String d1[] = actualReturn.split("\\s");
		String d2[] = expectedReturn.split("\\s");
		

		int actualReturnDay = Integer.parseInt(d1[0]);
		int actualReturnMonth = Integer.parseInt(d1[1]);
		int actualReturnYear = Integer.parseInt(d1[2]);

		int expectedReturnDay = Integer.parseInt(d2[0]);
		int expectedReturnMonth = Integer.parseInt(d2[1]);
		int expectedReturnYear = Integer.parseInt(d2[2]);

		if (actualReturnYear > expectedReturnYear) {
			fine = 1000;
		} else if (actualReturnMonth > expectedReturnMonth
				&& actualReturnYear == expectedReturnYear) {
			fine = 500 * (actualReturnMonth - expectedReturnMonth);
		} else if (actualReturnDay > expectedReturnDay
				&& actualReturnMonth == expectedReturnMonth
				&& actualReturnYear == expectedReturnYear) {
			fine = 15 * (actualReturnDay - expectedReturnDay);
		}else{
			fine = 0;
		}
		System.out.println(fine);
	}
}
