package com.arrays;

import java.util.Iterator;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class ShiftInd2 {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5, 6, 7 };
		int n = x.length;
		int k = 2;
		rotateToRight(x, n, k);
		for (int i : x) {
			System.out.print(i+" ");
		}
	}

	private static void rotateToRight(int[] x, int n, int k) {
		if (n == 0)
			return;
		k = k % n;
		if (k > n) 
			return;
		int[] temp = new int[k];
		for (int i = n-k; i < n; i++) {
			temp[i-n+k]=x[i];
		}
		for (int i = n-k-1; i >=0; i--) {
			x[i+k]=x[i];
		}
		for (int i = 0; i < k; i++) {
			x[i]=temp[i];
		}
	}

}
