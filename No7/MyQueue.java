package org.java.no7;

import java.util.Stack;

//泛型
public class MyQueue<T> {

	private Stack<T> stack1;
	private Stack<T> stack2;
	
	public MyQueue()
	{
		this.stack1 = new Stack<T>();
		this.stack2 = new Stack<T>();
	}
	
	public void appendTail(T node)
	{
		stack1.push(node);
	}
	
	public T deleteHead()
	{
		//判断队列是否为空
		if (stack2.size() == 0)
		{
			if (stack1.size() ==0)
			{
				try {
					throw new Exception("The queue is empty");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		while (!stack1.isEmpty())
		{
			T node = stack1.pop();
			stack2.push(node);
		}
		
		T result = stack2.pop();
		while (!stack2.isEmpty())
		{
			stack1.push(stack2.pop());
		}
		return result;
		
	}
}
