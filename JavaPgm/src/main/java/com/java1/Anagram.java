package com.java1;

import java.util.Scanner;

/*
*@author: Mahabir Prasad Mohapatra
*/
public class Anagram {

	public static String removeSpace(String str) {
		String nstr = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				nstr = nstr + ch[i];
			}
		}
		return nstr;
	}

	public static String toLowerCase(String str) {
		char[] ch = str.toCharArray();
		String nstr = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > 65 && ch[i] < 90) {
				nstr = nstr + (ch[i] + 65);
			} else {
				nstr = nstr + ch[i];
			}
		}
		return nstr;
	}

	public static String sort(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char t = ch[i];
					ch[i] = ch[j];
					ch[j] = t;
				}
			}
		}
		String st = new String(ch);
		return st;

	}

	public static boolean compare(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		} else {
			str1 = toLowerCase(str2);
			str2 = toLowerCase(str2);
			str1 = sort(str1);
			str2 = sort(str2);

			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					return false;
				}
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String str1 = sc.nextLine();
		System.out.println("enter second string");
		String str2 = sc.nextLine();
		str1=removeSpace(str1);
		str2=removeSpace(str2);
		boolean b = compare(str1, str2);
		
		if (b) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not an Anagram");
		}
	}

}
