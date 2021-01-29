package com.tz.thredsafeSp;

public class ThreadClass implements Runnable {

	@Override
	public void run() {
		
		ThreadSafeSingletonDesignPattern s = ThreadSafeSingletonDesignPattern.getInstance();
		System.out.println(Thread.currentThread().getName()+"   "+s.hashCode());
		
	}

}
