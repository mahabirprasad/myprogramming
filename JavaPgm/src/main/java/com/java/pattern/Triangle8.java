package com.java.pattern;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Triangle8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int k =0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				k++;
				System.out.print(k +" ");
			}
			System.out.println();
		}
	}

}
