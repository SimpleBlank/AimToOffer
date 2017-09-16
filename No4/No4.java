package org.java.no4;

public class No4 {
	public static void main(String[] args) {
		int[] matrix1 = { 1, 1, 1, 1, 1 };
		int[] matrix2 = { 2, 2, 2, 2, 2 };
		int length1 = matrix1.length - 1;
		int length2 = matrix2.length - 1;
		int[] result = new int[length1+length2+2];
		int i = result.length-1;
		while (length1 >= 0 && length2 >= 0) {
			if (matrix1[length1] >= matrix2[length2]) {
				result[i] = matrix1[length1];
				i--;
				length1--;
			} else {
				result[i] = matrix2[length2];
				i--;
				length2--;
			}
			
		}
		boolean left = length1 >= length2? true: false;
		if (left)
		{
			for (int j = length1; j>=0; j--)
			{
				result[j] = matrix1[j];
			}
		}
		else {
			for (int j = length2; j>=0; j--)
			{
				result[j] = matrix2[j];
			}
		}

		for (int j = 0; j < result.length; j++) {
			System.out.print(result[j] + " " );
		}
	}

}
