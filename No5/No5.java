package org.java.no5;

import java.util.Stack;

public class No5 {
	public static void main(String[] args)
	{
		//构造数据
		ListNode head = new ListNode(0);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(null);
		
		//用递归实现
		reverseListPrint_1(head);
		System.out.println();
		//用栈实现
		reverseLisPrint_2(head);
	}

	//用递归实现
	private static void reverseListPrint_1(ListNode head)
	{
		if (head != null)
		{
			if (head.getNext() != null)
			{
				reverseListPrint_1(head.getNext());
			}
			System.out.print(head.getValue() + " ");
		}
	}
	
	//用栈实现
	private static void reverseLisPrint_2(ListNode head)
	{
		Stack<ListNode> nodes = new Stack<ListNode>();
		if (head != null)
		{
			ListNode node = head;
			while (node != null)
			{
				nodes.push(node);
				node = node.getNext();
			}
			while (!nodes.isEmpty())
			{
				System.out.print(nodes.pop().getValue() + " ");
			}
		}
	}
}
