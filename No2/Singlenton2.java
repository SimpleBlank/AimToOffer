package org.test;

//懒汉式单例模式
//为getInstance方法加synchronized关键字保证线程安全
public class NO2 {
	private static NO2 instance = null;
	
	private NO2(){}
	
	public static synchronized NO2 getInstance()
	{
		if (instance == null)
		{
			instance = new NO2();
		}
		return instance;
	}

}
