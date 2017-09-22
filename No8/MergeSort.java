package org.java.no8.sort;

public class MergeSort {
	public static void main(String[] args)
	{
		int[] input = {5,4,8,9,1,2,7,11,0,12};
		print(input);
		sort(input, 0, input.length-1);
		print(input);
	}
	
	private static void sort(int[] input, int start, int end)
	{
		if (start >= end)
		{
			return;
		}
		int middle = (start + end)/2;
		sort(input, start, middle);
		sort(input, middle+1, end);
		merge(input, start, middle, end);
		print(input);
	}
	
	private static void merge(int[] input, int start, int middle, int end)
	{
		int[] temp = new int[end-start+1];
		int middleTemp = middle + 1;
		int index = 0;
		int item = start;
		//从两个数组中取出较小值放进临时数组
		while(start <= middle && middleTemp <= end)
		{
			if (input[start] <= input[middleTemp])
			{
				temp[index] = input[start];
				index++;
				start++;
			}
			else
			{
				temp[index] = input[middleTemp];
				index++;
				middleTemp++;
			}
		}
		//将数组中的剩余数值全部放进临时数组
		while(start <= middle)
		{
			temp[index] = input[start];
			index++;
			start++;
		}
		
		while(middleTemp <= end)
		{
			temp[index] = input[middleTemp];
			index++;
			middleTemp++;
		}
		
		//将临时数组中的数值复制进原来数组
		for (int i = 0; i < temp.length; i++) {
			input[item + i] = temp[i];
		}
	}
	
	private static void print(int[] input)
	{
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
	}

}
