package com.arrays;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class LinearSearch {

	public static void main(String[] args) {
		int[] x = { 9, 3, 2, 8, 4, 7 };
		System.out.println(linearSearch(x, 4));
		System.out.println(linearSearch(x, 6));
	}

	private static int linearSearch(int[] x, int y) {
		for (int i = 0; i < x.length; i++) {
			if (y == x[i]) {
				return i;
			}
		}
		return 0;
	}

}
