package com.hackerrank.interview_preparation_kit.arrays;

/**
 * 
 * https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 *
 */
public class Array2D {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {

		int sumHourGlass = doSumHourGlass( arr);
		return sumHourGlass;
	}

	private static int doSumHourGlass( int[][] arr1) {
		int sumHourGlass = 0;

		Integer max = Integer.MIN_VALUE;

		for (int i = 1; i < arr1.length - 1; i++) {
			int[] arr = arr1[i];
			for (int j = 1; j < arr.length - 1; j++) {
				int x = arr[j];

				sumHourGlass += x;

				sumHourGlass += arr1[i - 1][j - 1];
				sumHourGlass += arr1[i - 1][j];
				sumHourGlass += arr1[i - 1][j + 1];

				sumHourGlass += arr1[i + 1][j - 1];
				sumHourGlass += arr1[i + 1][j];
				sumHourGlass += arr1[i + 1][j + 1];

				if (max < sumHourGlass) {
					max = sumHourGlass;
				}
				sumHourGlass = 0;
			}

		}
		return max;
	}

	public static void main(String[] args) {
		int[][] arr = new int[10][10];

		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;
		arr[0][3] = 0;
		arr[0][4] = 0;
		arr[0][5] = 0;

		arr[1][0] = 0;
		arr[1][1] = 1;
		arr[1][2] = 0;
		arr[1][3] = 0;
		arr[1][4] = 0;
		arr[1][5] = 0;

		arr[2][0] = 1;
		arr[2][1] = 1;
		arr[2][2] = 1;
		arr[2][3] = 0;
		arr[2][4] = 0;
		arr[2][5] = 0;

		arr[3][0] = 0;
		arr[3][1] = 0;
		arr[3][2] = 2;
		arr[3][3] = 4;
		arr[3][4] = 4;
		arr[3][5] = 0;

		arr[4][0] = 0;
		arr[4][1] = 0;
		arr[4][2] = 0;
		arr[4][3] = 2;
		arr[4][4] = 0;
		arr[4][5] = 0;

		arr[5][0] = 0;
		arr[5][1] = 0;
		arr[5][2] = 1;
		arr[5][3] = 2;
		arr[5][4] = 4;
		arr[5][5] = 0;

		int result = hourglassSum(arr);
		System.out.println(result);
	}

}
