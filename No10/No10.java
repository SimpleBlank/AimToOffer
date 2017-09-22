package org.java.no10;

import java.util.Scanner;

public class No10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int input = scanner.nextInt();
			String binary = getBinary(input);
			System.out.println(getOneNUmberInBinary(binary));
			System.out.println(getOneNumberN(input));
			System.out.println(getOneNumber(input));
		}
	}
	
	private static String getBinary(int input)
	{
		StringBuilder builder = new StringBuilder();
		while(input > 1)
		{
			builder.append(input%2);
			input/=2;
		}
		builder.append(1);
		builder.reverse();
		return builder.toString();
	}
	
	//最笨的解法
	private static int getOneNUmberInBinary(String binary)
	{
		char[] cs = binary.toCharArray();
		int count =0;
		for (int i = 0; i < cs.length; i++) {
			if(cs[i] == '1')
			count++;
		}
		return count;
	}
	
	//位运算解法，循环的次数等于二进制的位数
	private static int getOneNumberN(int input)
	{
		int flag = 1;
		int count =0;
		while(flag !=0 )
		{
			if ((flag & input) > 0)
			{
				count ++;
			}
			flag = flag << 1;
		}
		return count;
	}
	
	//位运算解法，循环的次数等于输入中的二进制表示中1的个数
	private static int getOneNumber(int input)
	{
		int flag = 1;
		int count =0;
		while(input !=0 )
		{
			count++;
			input = (input-1) & input;
		}
		return count;
	}
	

}
