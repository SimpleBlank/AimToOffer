package org.test;

//懒汉式单例模式(线程不安全)
public class NO2 {
	private static NO2 instance = null;
	
	private NO2(){}
	
	public static NO2 getInstance()
	{
		if (instance == null)
		{
			instance = new NO2();
		}
		return instance;
	}

}
