package org.java.no8;

public class No8 {
	public static void main(String[] args) {

		int[] init = { 1, 0, 1, 1, 1 };
		getMin(init);

		reGetMIn(init);
		
	}
	
	private static void getMin(int[] init)
	{
		int start = 0;
		int end = init.length - 1;
		//若旋转数组就是数组本身，那么第一个元素就是数组的最小值
		int middle =start;
		while (init[start] >= init[end]) {
			// 数组中就只有两个数，最小的为后者  
			if (end -start == 1)
			{
				middle = end;
				break;
			}
			middle = (start + end)/2;
			if (init[middle] >= init[start])
			{
				start = middle;
			}
			else if (init[middle] <= init[end]) {
				end = middle;
			}
			
		}
		System.out.println(init[middle]);
	}
	
	//但是上述解法对于{1，0，1，1，1}和{1，1，1，0，1}这种特殊情形时就不能准确解出结果，因为start，end， middle这三个数对应数组中的数是相等的，
	//就没法判断是在哪个具体的子数组中，所以算出的结果就不准确。所以遇到这种情形就只能用顺序查找的方法进行查找。
	
	private static void reGetMIn(int[] init)
	{
		int start = 0;
		int end = init.length - 1;
		//若旋转数组就是数组本身，那么第一个元素就是数组的最小值
		int middle =start;
		while (init[start] >= init[end]) {
			// 数组中就只有两个数，最小的为后者  
			if (end -start == 1)
			{
				middle = end;
				break;
			}
			middle = (start + end)/2;
			
			//做下判断
			if(init[start] ==init[middle] && init[middle] == init[end])
			{
				orderSearch(init, start, end);
				return;
			}
			if (init[middle] >= init[start])
			{
				start = middle;
			}
			else if (init[middle] <= init[end]) {
				end = middle;
			}
			
		}
		System.out.println(init[middle]);
	}
	
	private static void orderSearch(int[] init, int start, int end)
	{
		int min = init[start];
		for (int i = start; i <= end; i++) {
			if (init[i] < min)
			{
				min = init[i];
			}
		}
		System.out.println(min);
	}
}
