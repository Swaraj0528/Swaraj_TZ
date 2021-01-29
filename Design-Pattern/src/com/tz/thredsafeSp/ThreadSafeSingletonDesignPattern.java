package com.tz.thredsafeSp;

public class ThreadSafeSingletonDesignPattern {
	
	//Private instance variable
	private static ThreadSafeSingletonDesignPattern instance =null;
	
	//private Constructor
	private ThreadSafeSingletonDesignPattern() {
		
	}
	
	public static ThreadSafeSingletonDesignPattern getInstance() {
		if(instance==null) {
			synchronized (ThreadSafeSingletonDesignPattern.class) {
				if(instance==null) {
					instance = new ThreadSafeSingletonDesignPattern();
				}
			}
		}
		return instance;
	}

}
