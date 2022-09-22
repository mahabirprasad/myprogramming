package com.recursion;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Pallindrum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		str = toremoveSPace(str);
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length / 2; i++) {
			char t = ch[i];
			ch[i] = ch[ch.length - 1 - i];
			ch[ch.length - 1 - i] = t;
		}
		String nstr = new String(ch);
		if (nstr.equalsIgnoreCase(str)) {
			System.out.println("pallindrum");
		} else {
			System.out.println("not pallindrum");
		}
	}

	static String toremoveSPace(String s) {
		char[] ch = s.toCharArray();
		String nstr = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90 || ch[i] >= 97 && ch[i] <= 122|| ch[i] >= 48 && ch[i] <= 57) {
				nstr = nstr + ch[i];
			}
		}
		return nstr;

	}
}
