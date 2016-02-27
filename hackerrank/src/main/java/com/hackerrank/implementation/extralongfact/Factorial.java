package com.hackerrank.implementation.extralongfact;

import java.math.BigInteger;

public class Factorial {
	private static int factorialRec(int number){
		int fact = 1;
		if(number == 1){
			return 1;
		}else{
			fact = number * factorialRec(number - 1);
		}
		return fact;
	}
	
	
	private static int factorial(int number){
		int fact = 1;
		if(number == 0){
			return 1;
		}else{
			for(int i = 1; i <= number; i++){
				fact = fact * i;
			}
		}
		return fact;
	}
	
	private static BigInteger bigFactorial(int number){
		BigInteger fact = new BigInteger("1");
		BigInteger increment = new BigInteger("1");
		
		if(number == 0){
			return BigInteger.ZERO;
		}else{
			for(int i = 1; i <= number; i++){
				fact = fact.multiply(increment);
				increment = increment.add(BigInteger.ONE);
			}
		}
		return fact;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(25));
		System.out.println(factorialRec(25));
		System.out.println(bigFactorial(25));
	}
}
