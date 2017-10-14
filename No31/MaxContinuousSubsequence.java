package org.java.no31;

import java.util.HashMap;
import java.util.Map;

//输出子序列，如果最大值对应的子序列不止一个，则把所有满足最大值的子序列都输出出来
public class MaxContinuousSubsequence {
	public static void main(String[] args)
	{
		int[] numbers = {3,1,10,-1,-11,-12,3,3,7,-15,13,-20,1,1,1,10,-30,12,1};
		System.out.println(maxSub(numbers));
	}
	
	private static int maxSub(int[] numbers)
	{
		int max =0;
		int sum =0;
		int start =0;
		int end =0;
		int index =0;
		Map<Integer, Integer> postion = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			index++;
			if (sum < 0)
			{
				sum =0;
				index =0;
			}
			else if (numbers[i] > 0)
			{
				if (sum > max)
				{
					end = i;
					start = end -index +1;
					postion.clear();
					postion.put(start, end);
					max = sum;
				}
				else if (sum == max)
				{
					end = i;
					start = end -index +1;
					postion.put(start, end);
				}
					
			}
			
		}
		for (Map.Entry<Integer, Integer> entry : postion.entrySet())
		{
			for (int i = entry.getKey(); i<=entry.getValue(); i++)
			{
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}
		return max;
	}

}
