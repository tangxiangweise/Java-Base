package com.macro.java;

public class EightQueen {

	public static int count;

	public static void main(String[] args) {
		int[][] chess = new int[8][8];
		for (int[] ches : chess) {
			for (int i : ches) {
				i = 0;
			}
		}

		queen(0, 8, chess);
		System.out.println("总共有" + count);
	}

	public static void queen(int row, int n, int[][] chess) {
		int nums[][] = new int[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				nums[i][j] = chess[i][j];
			}
		}
		if (row == 8) {
			System.out.println("第几种" + count);
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					System.out.print("  " + nums[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			count++;
		} else {
			for (int i = 0; i < n; i++) {
				if (notDanger(row, i, chess)) {
					for (int j = 0; j < 8; j++) {
						nums[row][j] = 0;
					}
					nums[row][i] = 1;
					queen(row + 1, n, nums);
				}
			}
		}
	}

	private static boolean notDanger(int row, int j, int[][] chess) {
		boolean flag1 = false, flag2 = false, flag3 = false, flag4 = false, flag5 = false;
		int i, k;
		for (i = 0; i < 8; i++) {
			if (chess[i][j] != 0) {
				flag1 = true;
				break;
			}
		}
		for (i = row, k = i; i >= 0 && k >= 0; i--, k--) {
			if (chess[i][k] != 0) {
				flag2 = true;
				break;
			}
		}

		for (i = row, k = i; i < 8 && k < 8; i++, k++) {
			if (chess[i][k] != 0) {
				flag3 = true;
				break;
			}
		}

		for (i = row, k = i; i >= 0 && k < 8; i--, k++) {
			if (chess[i][k] != 0) {
				flag4 = true;
				break;
			}
		}

		for (i = row, k = i; i < 8 && k >= 0; i++, k--) {
			if (chess[i][k] != 0) {
				flag5 = true;
				break;
			}
		}
		if (flag1 || flag2 || flag3 || flag4 || flag5) {
			return false;
		} else {
			return true;
		}
	}
}
