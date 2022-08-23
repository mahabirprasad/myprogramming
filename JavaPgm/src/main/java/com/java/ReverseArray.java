package com.java;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {78,56,34,54,65};
		for (int i = 0; i < arr.length/2; i++) {
			int t = arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=t;
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
