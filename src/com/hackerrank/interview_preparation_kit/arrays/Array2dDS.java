package com.hackerrank.interview_preparation_kit.arrays;
/**
 * https://www.hackerrank.com/interview/interview-preparation-kit/arrays/challenges
 * https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays
 *
 */
public class Array2dDS {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		
		int maxHourGlass = 0;
		
		calculateMaxHourGlass(arr); 
		
		return maxHourGlass ; 
	}

	private static void calculateMaxHourGlass(int[][] arr) {
		int maxColumn = arr[0].length; 
		int maxRow = arr.length; 

		
		for (int i = 0; i < arr.length; i++) {
			int[] js = arr[i];
			
			for (int j = 0; j < js.length; j++) {

				
			}
		}
		
	}
}
