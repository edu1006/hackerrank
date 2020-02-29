package com.hackerrank.challenges;

/**
 * https://www.hackerrank.com/challenges/kangaroo/problem
 *
 */
public class Kangaroo {

	// Complete the kangaroo function below.
	static String kangaroo(int x1, int v1, int x2, int v2) {
		String value = null;
		int sum1 = x1;
		int sum2 = x2;
		for (int i = 0; i < 10000; i++) {
			sum1+=  v1;
			sum2+= v2;
			if (sum1 == sum2) {
				value = "YES";
				break;
			}
			value = "NO";
		}
		return value; 
	}
}
