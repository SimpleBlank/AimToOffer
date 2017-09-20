package org.java.no8.sort;

public class QuickSort {
	public static void main(String[] args) {
		int[] init = {4,5,8,1,2,22,1,40,24,15,56,99};
		quickSort(init, 0, init.length-1);
		for (int i = 0; i < init.length; i++) {
			System.out.print(init[i] + " ");
		}
	}

	private static void quickSort(int[] init, int start, int end) {
		int base = init[start];
		int oStart = start;
		int oEnd = end;
		int index = 0;
		if (start >= end)
		{
			return;
		}
		while(start < end)
		{
			while (init[end] >= base && start < end)
			{
				end--;
			}
			init[start] = init[end];
			
			while(init[start] < base && start < end)
			{
				start++;
			}
			init[end] = init[start];
		}
		init[end] = base;
		index = end;
		//init[index] 已经是中间数算排好序了，故不用再进行递归排序
		quickSort(init, oStart, index-1);
		quickSort(init, index+1, oEnd);
		
	}
	
	private static void swap(int a, int b)
	{
		int c = b;
		b = a;
		a = c;
	}
	
	public static int partition(int[] array,int lo,int hi){
        //固定的切分方式
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){//从后半部分向前扫描
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){//从前半部分向后扫描
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
        return hi;
    }
    
    public static void sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi); 
    }

}
