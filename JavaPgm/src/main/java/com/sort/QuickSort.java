package com.sort;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class QuickSort {

	public static void main(String[] args) {
		int[] x = { 79, 21, 11, 23, 56, 87, 90, 27 };
		int n = x.length;
		quickSort(x, 0, n - 1);
		for (int i : x) {
			System.out.print(i+" ");
		}
	}

	private static void quickSort(int[] x, int s, int e) {
		if (s < e) {
			int pivot = partition(x, s, e);
			quickSort(x, s, pivot - 1);
			quickSort(x, pivot + 1, e);
		}

	}

	private static int partition(int[] x, int s, int e) {
		int pivot = x[e];
		int i = s - 1;
		for (int j = s; j < e; j++) {
			if (x[j] < pivot) {
				i++;

				int t = x[i];
				x[i] = x[j];
				x[j] = t;
			}
		}
		i++;
		int t = x[i];
		x[i]=x[e];
		x[e]=t;
		return i;
	}

}
