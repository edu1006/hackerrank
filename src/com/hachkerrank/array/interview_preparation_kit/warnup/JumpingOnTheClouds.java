package com.hachkerrank.array.interview_preparation_kit.warnup;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
 *
 */
public class JumpingOnTheClouds {
	public static final int MAGIC_JUMP = 2;
	public static final int SINGLE_JUMP = 1;

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
		int jumps = 0;
		for (int i = 0; i < c.length;) {
			System.out.println(c[i]);
			if (c[i] != 1) {

				if (i + MAGIC_JUMP < c.length && c[i + MAGIC_JUMP] == 0) {
					i += MAGIC_JUMP;
					jumps++;
				} else if (i + SINGLE_JUMP < c.length && c[i + SINGLE_JUMP] == 0) {
					i += SINGLE_JUMP;

					jumps++;

				}else {
					i++; 
				}
			}
		}
		return jumps;
	}

	public static void main(String[] args) {
		int[] c = { 0, 0, 0, 1, 0, 0 };
		System.err.println(jumpingOnClouds(c));
	}
}
