package org.java.no31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LongestCommonSubsequence {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			String str1 = scanner.nextLine();
			String str2 = scanner.nextLine();
			List<String> result = getLCS(str1, str2);
			if (result.size() > 0)
			{
				for (String string : result) {
					System.out.print(string + " ");
				}
				System.out.println();
			}
		}
	}
	
	private static List<String> getLCS(String str1, String str2)
	{
		List<String> result = new ArrayList<>();
		int length1 = str1.length();
		int length2 = str2.length();
		
		int[] lastLine = new int[length2];
		int[] currentLine = new int[length2];
		
		int maxLen = 0;
		int postion = 0;
		
		Map<Integer, Integer> record = new HashMap<>();
		
		for (int i=0; i<length1; i++)
		{
			char temp = str1.charAt(i);
			 for (int j =0; j<length2; j++)
			 {
				 if (temp == str2.charAt(j))
				 {
					 if (j == 0)
					 {
						 currentLine[j] = 1;
					 }
					 else 
					 {
						 currentLine[j] = lastLine[j-1] + 1;
					 }
					 
					 //记录中间结果
					 if (currentLine[j] > maxLen)
					 {
						 maxLen = currentLine[j];
						 postion = j;
						 record.clear();
						 record.put(postion-maxLen+1, postion);
					 }
					 else if (currentLine[j] == maxLen) {
						record.put(j-maxLen+1, j);
					}
				 }
			 }
			 
			 //处理lastLine和currentLine
			 lastLine = currentLine;
			 currentLine = new int[length2];
		}
		System.out.println(maxLen);
		
		for(Map.Entry<Integer, Integer> entry : record.entrySet())
		{
			int start = entry.getKey();
			int end = entry.getValue()+1;
			result.add(str2.substring(start, end));
		}
		
		return result;
		
	}

}
