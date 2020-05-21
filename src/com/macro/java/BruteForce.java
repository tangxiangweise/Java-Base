package com.macro.java;

public class BruteForce {
	public static void main(String[] args) {
		String var = "ILoveFishC.com";
		String var2 = "FishC.com";
		char[] car = var.toCharArray();
		char[] car1 = var2.toCharArray();
		int num = 0;
		for (int i = 0; i < car.length; i++) {

			if (car[i] == car1[num]) {
				System.out.print(car[i]);
				num++;
			}
		}
	}
}
