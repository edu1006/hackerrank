package com.hackerrank.interview_preparation_kit.arrays;
/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 * @author eduardo
 *
 */
public class LeftRotation {

	
	 // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	Integer fisrt = a[0]; 
    	
    	for (int i = 1; i < a.length; i++) {
    		a[i -1 ] = a[i]; 
		}
    	a[a.length -1] = fisrt; 
    	d--; 
    	if (d > 0) {
			return rotLeft(a, d );
		}
    			
		return a; 
    }

    public static void main(String[] args) {
    	int[] a = {1,2,3,4,5};
		 a= rotLeft(a , 4);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
    }
}
