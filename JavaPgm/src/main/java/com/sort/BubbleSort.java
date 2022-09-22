package com.sort;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class BubbleSort {

	public static void main(String[] args) {
		int[] x = { 45, 43, 23, 78, 68, 46, 76 };
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					int t = x[i];
					x[i] = x[j];
					x[j] = t;
				}
			}

		}
		for (int k : x) {
			System.out.print(k + " ");
		}
	}

}
