package org.java.no6;

import org.java.BinaryTreeNode;

public class No6 {
	public static void main(String[] args)
	{
		int[] frontSequence = {1,2,4,7,3,5,6,8};
		int[] middleSequence = {4,7,2,1,5,3,8,6};
		BinaryTreeNode root = recoveryBinaryTree(frontSequence, middleSequence);
		printBinaryRootNode(root);
	}
	
	private static BinaryTreeNode recoveryBinaryTree(int[] front, int[] middle)
	{
		BinaryTreeNode rootNode = new BinaryTreeNode(front[0], null, null);
		int leftNumber = 0;
		
		for (int i = 0; i < middle.length; i++) {
			if (middle[i] == rootNode.getValue())
			{
				break;
			}
			else
			{
				leftNumber++;
			}
		}
		int rightNumber = front.length - 1 - leftNumber;
		
		if (leftNumber > 0)
		{
			int[] frontLeftOrder = new int[leftNumber];
			int[] middleLeftOrder = new int[leftNumber];
			for (int i=0; i<leftNumber; i++)
			{
				frontLeftOrder[i] = front[1+i];
				middleLeftOrder[i] = middle[i];
			}
			BinaryTreeNode leftRoot = recoveryBinaryTree(frontLeftOrder, middleLeftOrder);
			rootNode.setLeftNode(leftRoot);
		}
		
		if (rightNumber > 0)
		{
			int[] frontRightOrder = new int[rightNumber];
			int[] middleRightOrder = new int[rightNumber];
			for(int i=0; i<rightNumber ;i++)
			{
				frontRightOrder[i] = front[leftNumber +1 +i];
				middleRightOrder[i] = middle[leftNumber +1 +i];
			}
			BinaryTreeNode rightRoot = recoveryBinaryTree(frontRightOrder, middleRightOrder);
			rootNode.setRightNode(rightRoot);
		}
		
		return rootNode;
	}
	
	private static void printBinaryRootNode(BinaryTreeNode node)
	{
		//根据输出语句放置的顺序可以控制前序，中序，后序输出此二叉树序列
		if (node != null)
		{
			printBinaryRootNode(node.getLeftNode());
			System.out.print(node.getValue() + "->");
			printBinaryRootNode(node.getRightNode());
		}
	}

}
