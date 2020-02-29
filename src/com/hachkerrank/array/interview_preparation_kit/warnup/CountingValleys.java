package com.hachkerrank.array.interview_preparation_kit.warnup;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
 *
 */
public class CountingValleys {

	private static final char UP = 'U';
	private static final char DOWN = 'D';

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
		int steps = 0;

		int stepsUp = 0; 
		int stepsDown = 0 ;
		boolean startingValley = false;
		int level = 0; 
		for (int i = 0; i < s.length(); ) {
			if (s.charAt(i) == DOWN) {
				stepsDown++; 
				level--; 
				if (level < 0) {
					startingValley = true; 
				}
			} else if (s.charAt(i) == UP) {
				stepsUp++; 
				level++; 

			}
			if (startingValley && stepsUp - stepsDown == 0) {

				startingValley = false;
				steps++; 
				
			}
			i++; 
		}
		return steps; 
	}

	public static void main(String[] args) {
		System.out.println( countingValleys(8, "UDDDUDUU"));
	}
}
