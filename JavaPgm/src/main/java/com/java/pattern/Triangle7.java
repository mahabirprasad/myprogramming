package com.java.pattern;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Triangle7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int x,y;
		for (int i = 0; i < n; i++) {
			if (i%2==0) {
				 x =0;
				 y=1;
			} else {
				x=1;
				y=0;
			}
			for (int j = 0; j <i; j++) {
				if (j%2==0) {
					System.out.print(x);
				} else {
					System.out.print(y);
				}
			}
			System.out.println();
		}
	}

}
