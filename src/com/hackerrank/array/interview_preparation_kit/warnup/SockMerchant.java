package com.hackerrank.array.interview_preparation_kit.warnup;
import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/sock-merchant?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 *
 */
public class SockMerchant {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int pairs = 0;
		int number = 0;
		Integer x = 0;
		List<Integer> pairsAux = new ArrayList<>(); 
		int countNumber = 0;
		while (number < n) {		
			x = ar[number];
			for (int i = 0; i < ar.length; i++) {
				if (i != number && x ==ar[i] && !pairsAux.contains(x)) {
					countNumber++; 
				}
			}
			if (!pairsAux.contains(x)) {
				if ((countNumber + 1)%2 ==0) {
					countNumber++; 
				}
			}
			pairs+=countNumber/2; 
			countNumber = 0; 
			pairsAux.add(x);
			number++; 
		}

		return pairs; 
	}


	public static void main(String[] args) {
		int[] ar = {10,20,20,10,10,30,50,10,20};
		System.out.println(sockMerchant(9	, ar ));
	}
}
