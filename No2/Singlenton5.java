package org.test;

//饿汉模式,在类进行初始化时，已经实例化对象了，确保不会出现线程安全问题
public class NO2 {
	private static final NO2 INSTANCE = new NO2();
	
	private NO2(){}
	
	public static final NO2 getInstance()
	{
		
		return INSTANCE;
	}

}
