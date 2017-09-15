package org.test;

//懒汉式单例模式
//解决多线程下的问题
//1.为getInstance方法加synchronized关键字保证线程安全
//2.双重检查锁定
//3.静态内部类，此方法利用类加载机制，即保证了线程安全，也避免了synchronized带来的性能影响
public class NO2 {
	private static class InstanceHolder
	{
		private static final NO2 INSTANCE = new NO2();
	}
	
	private NO2(){}
	
	public static final NO2 getInstance()
	{
		
		return InstanceHolder.INSTANCE;
	}

}
