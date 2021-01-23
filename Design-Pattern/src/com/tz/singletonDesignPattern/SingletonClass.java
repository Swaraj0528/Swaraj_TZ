package com.tz.singletonDesignPattern;

import java.io.Serializable;

public class SingletonClass{
	
	
	//Eager initilization
	private static SingletonClass singletonInstance = new SingletonClass();

	//so that not availble to access using new keyword
	private SingletonClass() {
	
	}
	
	public static SingletonClass getInstance() {
		return singletonInstance;
	}
	
	public void sampleMethod() {
		System.out.println("Hashcode of singleton object"+singletonInstance.hashCode());
	}
	

}
