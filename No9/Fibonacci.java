package org.java.no9;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int n = scanner.nextInt();
			System.out.println(FiboWithRe(n));
			
			System.out.println(FiboWithoutRe(n));
		}
	}
	
	//递归常规解法
	private static long FiboWithRe(int n)
	{
		if (n == 0 || n ==1)
		{
			return n;
		}
		else
		{
			return FiboWithRe(n-1) + FiboWithRe(n-2);
		}
	}
	
	//非递归循环解法,时间复杂度O(n)
	private static long FiboWithoutRe(int n)
	{
		if (n == 0 || n ==1)
		{
			return n;
		}
		long FiboOne =0;
		long FiboTwo = 1;
		long result =1;
		for(int i=2; i<=n; i++)
		{
			result = FiboOne + FiboTwo;
			FiboOne = FiboTwo;
			FiboTwo = result;
		}
		return result;
	}

}
