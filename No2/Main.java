package org.test;

public class Main {
	public static void main(String[] args)
	{
		SinglentonTest singlentonTest1 = SinglentonTest.getInstance();
		singlentonTest1.setName("jason");
		SinglentonTest singlentonTest2 = SinglentonTest.getInstance();
		singlentonTest2.setName("joe");
		
		singlentonTest1.printInfo();
		singlentonTest2.printInfo();
		
		if (singlentonTest1 == singlentonTest2)
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
