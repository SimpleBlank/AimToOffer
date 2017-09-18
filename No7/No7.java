package org.java.no7;


public class No7 {
	public static void main(String[] args)
	{
		MyQueue<Integer> queue = new MyQueue<>();
		for (int i =1; i< 10; i++)
		{
			queue.appendTail(i);
		}
		for (int i =0; i<10; i++)
		{
			if (i == 5)
			{
				queue.appendTail(10);
			}
			System.out.print(queue.deleteHead() + " ");
		}
		
		System.out.println();
		
		MyStack<Integer> stack = new MyStack<>();
		for (int i =1; i< 10; i++)
		{
			stack.appendTail(i);
		}
		for (int i =0; i< 10; i++)
		{
			if (i == 5)
			{
				stack.appendTail(10);
			}
			System.out.print(stack.deleteEnd() + " ");
		}
	}

}
