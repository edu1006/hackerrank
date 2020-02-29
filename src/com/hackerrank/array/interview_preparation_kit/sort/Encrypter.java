package com.hackerrank.array.interview_preparation_kit.sort;

public class Encrypter {

	public static String getEncryptedName(String name) {
		char[] arr = name.toCharArray();
		String c = null;
		for (int i = 0; i < arr.length; i++) {
			c = String.valueOf(arr[i]);
			if (c.contains("?") || name.length() > 100) {
				throw new IllegalArgumentException("Try again with valid name");
			}
			isNumber(c); 
		}
		StringBuilder sb = new StringBuilder(name);
		return sb.reverse().toString().toLowerCase();
	}

	private static void isNumber(String c) {
		try {
			Integer.parseInt(c); 
			throw new IllegalArgumentException("Try again with valid name");
		} catch (NumberFormatException e) {
		}
		
	}
}
