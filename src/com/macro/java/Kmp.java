package com.macro.java;

public class Kmp {

	/**
	 * a b a b a a a b a 1 2 3 4 5 6 7 8 9 0 1 1 2 3 4 2 2 3
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		char[] chars = { 9, 'a', 'b', 'a', 'b', 'a', 'a', 'a', 'b', 'a' };
		int[] next = new int[chars.length];
		getNext(chars, next);
		System.out.println();
	}

	public static void getNext(char[] chars, int[] next) {
		int i = 1;
		int j = 0;
		next[0] = next.length;
		next[1] = 0;
		while (i < chars[0]) {
			if (j == 0 || chars[i] == chars[j]) {
				i++;
				j++;
				if (chars[i] != chars[j]) {
					next[i] = j;
				} else {
					next[i] = next[j];
				}
			} else {
				j = next[j];
			}
		}
	}

	public int IndexKmp(char[] main, char[] chars, int pos) {
		int i = pos;
		int j = 1;
		int[] next = new int[255];
		getNext(chars, next);

		while (i <= main[0] && j <= chars[0]) {
			if (0 == j || main[i] == chars[i]) {
				i++;
				j++;
			} else {
				j = next[j];
			}
		}
		if (j > chars[0]) {
			return i - chars[0];
		}
		return 0;
	}
}
