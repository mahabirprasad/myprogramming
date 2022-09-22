package com.arrays;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class ShiftInd {

	public static void main(String[] args) {
		int[] x = { 90, 34, 47, 94, 11, 60 };
		int n = x.length;
		shift(x,n);
	}

	private static void shift(int[] x, int n) {
		int[] temp = new int[n];
		for (int i = 1; i < x.length; i++) {
			temp[i-1]=x[i];
		}
		temp[n-1]=x[0];
		for (int i : temp) {
			System.out.print(i+" ");
		}
	}

}
