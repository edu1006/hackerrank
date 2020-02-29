package com.hachkerrank.array.interview_preparation_kit.warnup;
/**
 *https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
 */
public class RepeatedString {

	static long repeatedString(String s, long n) {
		char[] chrIn = s.toCharArray();
		int i = 0;
		long max = 0;
		long quo = n / chrIn.length;
		long rem = n % chrIn.length;
		while (i < chrIn.length) {
			if (chrIn[i] == 'a') {
				max++;
			}
			i++;
		}
		i = 0;
		max = max * quo;
		while (i < rem) {
			if (chrIn[i] == 'a') {
				max++;
			}
			i++;

		}
		return max;
	}

	public static void main(String[] args) {

		repeatedString("aba", 10);
	}
}
