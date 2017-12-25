package org.java.no12;

import java.util.Scanner;

public class No12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		printToMax(n);

	}

	public static void printToMax(int n) {
		if (n <= 0)
			return;
		int[] array = new int[n];

		while (increase(array, n - 1)) {
			print(array);
		}
	}

	private static boolean increase(int[] array, int n) {
		if (n < 0) {
			return false;
		} else if (array[n] < 9) {
			array[n]++;
			return true;
		} else {
			array[n] = 0;
			 return increase(array, n - 1);
		}
	}

	private static void print(int[] array) {
		int length = array.length;

		boolean isFirstNoZero = true;
		for (int i = 0; i < length; i++) {
			if (isFirstNoZero && array[i] != 0) {
				isFirstNoZero = false;
			}
			if (!isFirstNoZero) {
				System.out.print(array[i]);
			}
		}
		
		System.out.print(" ");
	}

}
