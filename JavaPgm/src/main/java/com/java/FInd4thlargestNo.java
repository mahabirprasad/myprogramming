package com.java;

import java.util.Iterator;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class FInd4thlargestNo {

	public static void main(String[] args) {
		int[] x = { 56, 65, 45, 43, 23, 82, 75, 49, 99 };
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] < x[j]) {
					int t = x[i];
					x[i] = x[j];
					x[j] = t;
				}
			}
		}
		for (int i : x) {
			System.out.println(i);
		}
		int no = x[3];
		System.out.println(no + "  4th largest no");
	}

}
