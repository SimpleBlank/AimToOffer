package org.test;

//懒汉式单例模式
//1.为getInstance方法加synchronized关键字保证线程安全
//2.双重检查锁定
public class NO2 {
	private volatile static NO2 instance = null;
	
	private NO2(){}
	
	public static NO2 getInstance()
	{
		if (instance == null)
		{
			synchronized (NO2.class) {
				if (instance == null)
				{
					instance = new NO2();
				}
			}
		}
		return instance;
	}

}
