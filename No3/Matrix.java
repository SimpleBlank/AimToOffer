package org.no3;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] martrix = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		while (scanner.hasNext()) {
			int target = scanner.nextInt();
			int lengths = martrix.length;
			int rows = martrix[0].length;
			int length = lengths - 1;
			int row = 0;
			int result = -1;
			while (row < rows && length >= 0) {
				if (martrix[row][length] == target) {
					result = target;
					break;
				} else if (martrix[row][length] > target) {
					length--;
				} else {
					row++;
				}
			}
			if (result == target) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
