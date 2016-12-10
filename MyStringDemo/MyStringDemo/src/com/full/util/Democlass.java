package com.full.util;

public class Democlass extends AbstractMyString {

	public String reverse(String s) {
		StringBuffer sb = new StringBuffer(s);
		String s1 = new String(sb.reverse());
		return s1;
	}

	public int getVowelsCount(String s) {
		String s1 = s.toLowerCase();
		int volwelscount = 0;
		for (int i = 0; i <= s1.length() - 1; i++) {
			char ch = s1.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				volwelscount = volwelscount + 1;
			}

		}
		return volwelscount;
	}

	public int getConsonantCount(String s) {
		return (s.length() - (getVowelsCount(s)));

	}

	public int getNumCapitalLetters(String s) {
		int capitallet = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				capitallet = capitallet + 1;
			}
		}
		return capitallet;
	}

	public int getLength(String s) {
		int length = s.length();
		return length;
	}

	public int getSumOfAllCharacters(String s) {
		String s1 = s.toLowerCase();
		String letters = "abcdefghijklmnopqrstuvwxyz";
		int sum = 0;
		for (int i = 0; i <= s1.length() - 1; i++) {
			int l = letters.indexOf(s1.charAt(i)) + 1;
			sum = sum + l;
		}
		return sum;
	}

}
