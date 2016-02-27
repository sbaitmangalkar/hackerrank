package com.hackerrank.sorting.insertionsort;

import java.util.Scanner;

public class Insertion {
	public static void insertIntoSorted(int[] ar) {
        int min = ar[0];
        int count = 0;
        for(int i = 1; i < ar.length; i++){
            min = ar[i];
            int j = i;
            while(j > 0 && ar[j - 1] > min){
                ar[j] = ar[j - 1];
                j = j - 1;
                //ar[j] = min;
              //  printArray(ar);
                count++;
                ar[j] = min;
            }
        }
        printArray(ar);
        System.out.println(count);
    }
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
