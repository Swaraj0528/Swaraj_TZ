package com.tz.singletonDesignPattern;

import com.tz.AbstractFactoryPattern.Teacher;

public class MainClass {
	
	//Eager initialisation
	public static void main(String[] args) {
		SingletonClass sc = SingletonClass.getInstance();
		sc.sampleMethod();
		SingletonClass sc1 = SingletonClass.getInstance();
		sc1.sampleMethod();
		
		Teacher teacher = new Teacher();
		System.out.println(teacher.hashCode());
		
		
		Teacher teacher1 = new Teacher();
		System.out.println(teacher1.hashCode());
		
		

	}
}
