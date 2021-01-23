package com.tz.singletonDesignPattern;

import java.io.Serializable;

public class DateUtils  implements Serializable,Cloneable{

	// private static DateUtils dateUtils = new DateUtils();
	private static volatile DateUtils dateUtils;

	private DateUtils() {

	}

	public static DateUtils getInstance() {
		// Lazy
		if(dateUtils==null){
			synchronized (DateUtils.class) {
				if (dateUtils == null) {
					dateUtils = new DateUtils();
				}
			}
		}
		return dateUtils;

	}
	
	protected Object readResolve() {
		return dateUtils;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new CloneNotSupportedException();
	}
}
