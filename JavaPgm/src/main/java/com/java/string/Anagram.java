package com.java.string;

import java.util.Scanner;

public class Anagram {

	public static String removeSpace(String s) {
		String nstr = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				nstr = nstr + ch[i];
			}
		}
		return nstr;
	}

	public static String toLowerCase(String s) {
		String nstr = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > 65 && ch[i] < 90) {
				nstr = nstr + ((char) ch[i] + 32);
			}
		}
		return nstr;
	}

	public static String sort(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char t = ch[i];
					ch[i] = ch[j];
					ch[j] = t;
				}
			}
		}
		String nstr = new String(ch);
		return nstr;
	}

	public static boolean compare(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		} else {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			s1 = toLowerCase(s1);
			s2 = toLowerCase(s2);
			s1 = sort(s1);
			s2 = sort(s2);
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i]!=ch2[i]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("enter two string");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		s1= removeSpace(s1);
		s2=removeSpace(s2);
		boolean b = compare(s1, s2);
		if (b) {
			System.out.println("Anagram");
		} else {
			System.out.println("not Anagram");
		}
	}

}
