package com.arrays;

import java.util.HashSet;
import java.util.Set;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] x = { 90, 87, 56, 11, 15, 90, 87, 90, 90 };
		int k = removeDUplicate(x);
		for (int i = 0; i < k; i++) {
			System.out.print(x[i] + " ");
		}
	}

	private static int removeDUplicate(int[] x) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < x.length; i++) {
			set.add(x[i]);
		}
		int k = set.size();
		int j = 0;
		for (Integer integer : set) {
			x[j++] = integer;
		}
		return k;
	}

}
