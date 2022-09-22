package com.sort;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class InsertionSort {

	public static void main(String[] args) {
		int[] x = { 67, 56, 32, 12, 90, 58, 76 };

		for (int i = 0; i < x.length; i++) {
			int temp = x[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (x[j] > temp) {
					x[j + 1] = x[j];
				} else {
					break;
				}
			}
			x[j + 1] = temp;
		}
		for (int i : x) {
			System.out.print(i+" ");
		} 
	}

}
