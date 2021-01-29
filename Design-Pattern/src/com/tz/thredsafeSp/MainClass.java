package com.tz.thredsafeSp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
		
		ThreadSafeSingletonDesignPattern t1= ThreadSafeSingletonDesignPattern.getInstance();
		ThreadSafeSingletonDesignPattern t2 = null;
		Class s = Class.forName("com.tz.thredsafeSp.ThreadSafeSingletonDesignPattern");
		Constructor[] declaredConstructors = s.getDeclaredConstructors();
		for(Constructor c:declaredConstructors) {
			c.setAccessible(true);
			
			Object ob = c.newInstance();
			t2 = (ThreadSafeSingletonDesignPattern)ob;
		}
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

	}

}
