package com.sort;
/*
*@author: Mahabir Prasad Mohapatra
*/
public class SelectionSort {

	public static void main(String[] args) {
		int[] x = {78,67,65,45,43,23,13,98};
		for (int i = 0; i < x.length; i++) {
			int mini = i;
			for (int j = i+1; j < x.length; j++) {
				if (x[j]<x[mini]) {
					mini=j;
				}
			}
			int t = x[mini];
			x[mini]=x[i];
			x[i]=t;
		}
		for (int i : x) {
			System.out.print(i+" ");
		}
		
	}

}
