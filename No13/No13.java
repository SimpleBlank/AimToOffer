package org.java.no13;

import org.java.ListNode;

public class No13 {

	public static void main(String[] args) {

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
		
		//before delete
		printNode(head);
		
		deleteNode(head, node3);
		
		//after delete
		printNode(head);
	}
	
	private static void deleteNode(ListNode head, ListNode deleteNode)
	{
		//if the deleteNode is the last node of the ListNode
		if (deleteNode.getNext() == null)
		{
			// if the ListNode just have one node
			if (head == deleteNode)
			{
				head = null;
				return;
			}
			
			while (head.getNext() != deleteNode)
			{
				head = head.getNext();
			}
			head.setNext(null);
		}
		else
		{
			ListNode temp = deleteNode.getNext();
			deleteNode.setValue(temp.getValue());
			deleteNode.setNext(temp.getNext());
		}
		
		
		
		
	}
	
	private static void printNode(ListNode head)
	{
		if (head == null)
			return;
		
		while(head != null)
		{
			System.out.print(head.getValue());
			System.out.print(" ");
			head = head.getNext();
		}
		System.out.println();
	}

}
