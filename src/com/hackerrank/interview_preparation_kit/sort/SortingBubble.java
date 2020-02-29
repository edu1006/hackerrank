package com.hackerrank.interview_preparation_kit.sort;

public class SortingBubble {

	// Complete the countSwaps function below.
    static void countSwaps(int[] a) {

    	int positionAux = 0;
    	int swaps = 0; 
    	for (int i = 1; i < a.length; i++) {
			if (a[i-1] >  a[i]) {
				 positionAux = a[i-1]; 
				 a[i-1] = a[i];
				 a[i] = positionAux; 
				 positionAux = 0; 
				 i = 0;
				 swaps++; 
			}
		}
    	System.out.println("Array is sorted in "+swaps+" swaps.");
    	System.out.println("First Element: "+a[0]);
    	System.out.println("Last Element: "+a[a.length-1]);
    }

    public static void main(String[] args) {
		int[] a = {6,4,1};
		countSwaps(a );
	}
}
