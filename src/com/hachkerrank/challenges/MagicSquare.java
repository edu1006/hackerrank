package com.hachkerrank.challenges;

public class MagicSquare {


	static int[][] mSquare1 = new int[][] { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };
	static int[][] mSquare2 = new int[][] { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } };
	static int[][] mSquare3 = new int[][] { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };
	static int[][] mSquare4 = new int[][] { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } };
	static int[][] mSquare5 = new int[][] { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } };
	static int[][] mSquare6 = new int[][] { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } };
	static int[][] mSquare7 = new int[][] { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } };
	static int[][] mSquare8 = new int[][] { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };

	// Complete the formingMagicSquare function below.
	static int formingMagicSquare(int[][] s) {

		int minValue = 500;
		int tempInt1 = matrixSubraction(s, mSquare1);
		int tempInt2 = matrixSubraction(s, mSquare2);
		int tempInt3 = matrixSubraction(s, mSquare3);
		int tempInt4 = matrixSubraction(s, mSquare4);
		int tempInt5 = matrixSubraction(s, mSquare5);
		int tempInt6 = matrixSubraction(s, mSquare6);
		int tempInt7 = matrixSubraction(s, mSquare7);
		int tempInt8 = matrixSubraction(s, mSquare8);

		if (tempInt1 < minValue)
			minValue = tempInt1;
		if (tempInt2 < minValue)
			minValue = tempInt2;
		if (tempInt3 < minValue)
			minValue = tempInt3;
		if (tempInt4 < minValue)
			minValue = tempInt4;
		if (tempInt5 < minValue)
			minValue = tempInt5;
		if (tempInt6 < minValue)
			minValue = tempInt6;
		if (tempInt7 < minValue)
			minValue = tempInt7;
		if (tempInt8 < minValue)
			minValue = tempInt8;


		return minValue; 
	}

	public static int matrixSubraction(int[][] matrix1, int[][] matrix2) {
		int[][] newMatrix = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				newMatrix[i][j] = Math.abs(matrix1[i][j] - matrix2[i][j]);
			}
		}

		return sumOfMatrix(newMatrix);
	}

	public static int sumOfMatrix(int[][] matrix) {
		return matrix[0][0] + matrix[0][1] + matrix[0][2] + matrix[1][0] + matrix[1][1] + matrix[1][2] + matrix[2][0]
				+ matrix[2][1] + matrix[2][2];
	}

	public static void main(String[] args) {
		int[][] s = new int[3][3];
		s[0][0] = 4;
		s[0][1] = 5;
		s[0][2] = 8;

		s[1][0] = 2;
		s[1][1] = 4;
		s[1][2] = 1;

		s[2][0] = 1;
		s[2][1] = 9;
		s[2][2] = 7;

		formingMagicSquare(s);
	}
}
