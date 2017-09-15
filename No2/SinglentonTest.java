package org.test;

public class SinglentonTest {
	
	String name = null;
	
	private SinglentonTest(){}
	
	private volatile static SinglentonTest instance = null;
	
	public static SinglentonTest getInstance()
	{
		if (instance == null)
		{
			synchronized (SinglentonTest.class) {
				if (instance == null)
				{
					instance = new SinglentonTest();
				}
				
			}
		}
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo()
	{
		System.out.println("this test name is: " + name );
	}

}
