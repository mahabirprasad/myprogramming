package com.java1;

import java.util.Iterator;
import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Panagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String str = sc.nextLine();
		String st = removeSpace(str);
		int d = check(st);
		if (d == -1) {
			System.out.println("not panagram");
		} else {
			System.out.println("panagram");
		}
	}

	private static int check(String st) {
		for (char i = 'A'; i <= 'Z'; i++) {
			if ((st.indexOf(i) < 0) && (st.indexOf((char) (i + 32)) < 0)) {
				return -1;
			}
		}
		return 1;
	}

	private static String removeSpace(String str) {
		char[] ch = str.toCharArray();
		String nstr = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				nstr = nstr + ch[i];
			}
		}
		return nstr;
	}
}
