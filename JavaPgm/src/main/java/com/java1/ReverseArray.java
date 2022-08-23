package com.java1;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a length");
		int length = sc.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter arr input");
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int t = arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
