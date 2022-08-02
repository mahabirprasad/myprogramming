package com.java;

import java.util.ArrayList;
import java.util.List;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class SecondLargestInCollection {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(100);
		l.add(10);
		l.add(95);
		l.add(50);
		l.add(105);

		Integer[] arr = l.stream().toArray(Integer[]::new);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		int no = arr[1];
		System.out.println("Second largest no" + no);
	}

}
