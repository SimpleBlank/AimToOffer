package org.java.no8.search;


public class BinarySearch {
	public static void main(String[] args)
	{
		int[] init = {1,5,7,9,11,20,22,23,50,99};
		System.out.println(binarySearch(init, 5));
		System.out.println(binarySearchWithRecursive(init, 0, init.length-1, 1111));
	}

	//循环方法
	private static boolean binarySearch(int[] init, int target)
	{
		int length = init.length;
		int start = 0;
		int end = length-1;
		while(start <= end)
		{
			int middle = (start + end)/2;
			if (init[middle] == target)
			{
				return true;
			}
			else if (init[middle] > target) {
				end = middle -1;
			}
			else {
				start = middle +1;
			}
			System.out.println(start + " , " + end);
		}
		
		return false;
	}
	
	//递归方法
	private static boolean binarySearchWithRecursive(int[] init, int start, int end, int target)
	{
		int middle = (start + end)/2;
		if (start < end)
		{
			if (init[middle] == target)
			{
				return true;
			}
			else if (init[middle] > target) {
				end = middle-1;
				return binarySearchWithRecursive(init, start, end, target);
			}
			else {
				start = middle +1;
				return binarySearchWithRecursive(init, start, end, target);
			}
		}
		else {
			return false;
		}
	}
}
