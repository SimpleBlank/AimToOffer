package org.no3;

import java.util.Scanner;

public class Matrix2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] martrix = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		while (scanner.hasNext()) {
			long start = System.currentTimeMillis();
			int target = scanner.nextInt();
			int lengths = martrix.length;
			int rows = martrix[0].length;
			int result = 0;
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < lengths; j++) {
					if (martrix[i][j] == target) {
						result = target;
						break;
					} else {
						continue;
					}
				}
				if (result == target) {
					break;
				}
			}
			if (result == target) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			long end = System.currentTimeMillis();
			System.out.println(start);
			System.out.println(end);
			System.out.println(end - start);
		}
	}

}
