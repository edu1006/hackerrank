package com.hackerrank.challenges;
/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 *
 */
public class AppleAndOrange {

	  // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

    	sumDistance(a, apples); 
    	sumDistance(b, oranges); 
    	int sumApples  = 0; 
    	int sumOranges  = 0; 
    	
    	for (int i : oranges) {
			if (i >= s && i<=t) {
				sumOranges++;
			}
		}
    	
    	for (int i : apples) {
    		if (i >= s && i<=t) {
				sumApples++; 
			}
			
		}
    	System.out.println(sumApples);
    	System.out.println(sumOranges);
    }

	private static void sumDistance(int a, int[] fruits) {
		for (int i = 0; i < fruits.length; i++) {
			fruits[i]= a+fruits[i];
			
		}
	}

	public static void main(String[] args) {
		int[] apples = {-2,2,1};
		int[] oranges= {5,-6};
		countApplesAndOranges(7, 11, 5, 15, apples, oranges);
	}
}
