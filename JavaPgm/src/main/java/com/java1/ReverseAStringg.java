package com.java1;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class ReverseAStringg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a STring");
		String str = sc.nextLine();
		String[] st = str.split(" ");
		for (int i = 0; i < st.length; i++) {
			for (int j = i + 1; j < st.length; j++) {
				String t = st[i];
				st[i] = st[j];
				st[j] = t;
			}
		}
		for (String string : st) {
			System.out.print(string+" ");
		}

	}

}
