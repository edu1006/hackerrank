package com.hackerrank.array.interview_preparation_kit.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Result {

	/*
	 * Complete the 'carParkingRoof' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * following parameters: 1. LONG_INTEGER_ARRAY cars 2. INTEGER k
	 */

	public static long carParkingRoof(List<Long> cars, int k) {
		Collections.sort(cars);
		int auxList = cars.size() - 1;
		long roofPositive = 0;
		long roofNegative = 0;
		long roof = Long.MAX_VALUE; 
		int sizeList = cars.size();
		for (int i = 0; i < sizeList ; i++) {
			if (i + k - 1 < sizeList && auxList - k + 1 < sizeList) {
				roofPositive = cars.get(i + k - 1) + 1 -  cars.get(i)  ;
				roofNegative = cars.get(auxList) - cars.get(auxList - k + 1) + 1;
				
				if (roofPositive <= roofNegative && roof > roofPositive) {
					roof = roofPositive;
				}else if (roof > roofNegative){
					roof = roofNegative; 
				}
			}
		}
//		System.out.println(roof);
		return roof;
	}

	public static void main(String[] args) {
		List<Long> cars = new ArrayList<Long>();
		cars.add(2l);
		cars.add(10l);
		cars.add(8l);
		cars.add(17l);

		carParkingRoof(cars, 3);
	}

}