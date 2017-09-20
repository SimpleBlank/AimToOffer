package org.java.no8.search;

public class BinarySearch {
	public static void main(String[] args)
	{
		int[] init = {1,5,7,9,11,20,22,23,50,99};
		System.out.println(binarySearch(init, 5));
	}

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
}
