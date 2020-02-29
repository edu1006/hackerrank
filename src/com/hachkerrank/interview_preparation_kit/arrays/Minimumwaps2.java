package com.hachkerrank.interview_preparation_kit.arrays;

public class Minimumwaps2 {

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {
		int swaps = 0;
		int pos = -1;
		while (doSwaps(arr, ++pos)) {
			swaps += 1;
		}
		return swaps;
	}

	private static boolean doSwaps(int[] arr, int pos) {
		boolean isCheck = true;
		if (pos < arr.length) {
			int x = 0;
			int y = 0;
			// Integer posAux = findMin(arr, arr[pos], pos);
			// y = findMinValue(arr,arr[pos], posAux);
			int posAux = pos + 1;
			while (true) {
				if (posAux < arr.length && arr[pos] > arr[posAux]) {
					x = arr[pos];
					y = arr[posAux];
					arr[pos] = y;
					arr[posAux] = x;
					isCheck = false;
					return true;
				} else if (pos + 1 >= arr.length) {
					return false;
				} else {
					posAux++;
					if (posAux >= arr.length) {
						// if (isCheck) {
						// return false;
						break;
						// }
					} else {
//						++pos; 
					}

				}
			}
			
		}
		if (isCheck) {
			return doSwaps(arr, ++pos); 
		}
		return false;
	}

	public static void main(String[] args) {
//		 int[] arr = { 1, 3, 5 ,2 ,4 ,6 ,7};

		int[] arr = { 2, 3, 4, 1, 5 };
		System.out.println(minimumSwaps(arr));
	}
}
