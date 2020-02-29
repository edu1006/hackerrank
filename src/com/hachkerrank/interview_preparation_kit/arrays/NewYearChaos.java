
package com.hachkerrank.interview_preparation_kit.arrays;

/**
 * 
 * https://www.hackerrank.com/interview/interview-preparation-kit/arrays/challenges
 * https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 *
 */
public class NewYearChaos {

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		int[] queue = createQueu(q.length);
		int brides = changeQueue(queue, q);
		
		boolean chaos = false; 
//		for (int i = 0; i < queue.length; i++) {
//			int j = queue[i];
//			if (j != q[i]) {
//				chaos = true; 
//				break; 
//			}
//		}
		if (brides <= 0) {
			System.out.println("Too chaotic");
		} else {
			System.out.println(brides);
		}
	}

	private static int changeQueue(int[] queue, int[] q) {
		int positionChange = 0;

		int brides = 0;
		int sum = 0;
		int chaos = -1; 
		for (int i = 0; i < q.length; i++) {
			int j = q[i];
			if (j != queue[i]) {
				sum = findAnt(queue, i, j);
				if (sum == 0) {
					return chaos; 
					
				}
				if (sum > 0 && sum <= 2) {
					for (int j2 = sum - 1; j2 >= 0; j2--) {
						brides++;
						positionChange = queue[i + j2];
						queue[i + j2] = j;
						queue[i + sum--] = positionChange;
					}
					i = i -1;
				}
			}
		}
		return brides;
	}

	private static int findAnt(int[] queue, int i, int j) {
		if ((i + 1) < queue.length && queue[i + 1] == j) {
			return 1;
		}
		if ((i + 2) < queue.length && queue[i + 2] == j) {
			return 2;
		}
		return 0;
	}

	private static int[] createQueu(int length) {
		int[] queue = new int[length];
		for (int i = 0; i < queue.length; i++) {
			queue[i] = i + 1;

		}
		return queue;
	}

	public static void main(String[] args) {
		int[] q = { 1, 2, 5 ,3 ,7 ,8 ,6 ,4};
		minimumBribes(q);
		;
	}
}
