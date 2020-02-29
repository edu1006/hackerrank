package com.hackerrank.challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/between-two-sets/problem?h_r=next-challenge&h_v=zen
 *
 */
public class BetweenTwoSets {

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int result = 0;
		for (Integer integer : b) {
			for (Integer isD: a) {
				result+=isD;
			}
		}
		return result ; 
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(4);

		List<Integer> b = new ArrayList<>();
		b.add(24);
		b.add(48);
//		b.add(96);


		getTotalX(a, b);
	}
}
