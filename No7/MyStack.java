package org.java.no7;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack<T> {
	private Queue<T> queue1;
	private Queue<T> queue2;
	
	public MyStack()
	{
		this.queue1 = new LinkedList<>();
		this.queue2 = new LinkedList<>();
	}
	
	public void appendTail(T node)
	{
		queue1.add(node);
	}
	
	public T deleteEnd()
	{
		if (queue2.size() == 0)
		{
			if (queue1.size() == 0)
			{
				try {
					throw new Exception("The Stack is Empty");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		while(queue1.size() > 1)
		{
			queue2.add(queue1.poll());
		}
		
		T result = queue1.peek();
		
		while(!queue2.isEmpty())
		{
			queue1.add(queue2.poll());
		}
		return result;
	}

}
