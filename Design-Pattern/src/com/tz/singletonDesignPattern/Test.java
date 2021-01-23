package com.tz.singletonDesignPattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		DateUtils dateUtils = DateUtils.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(new File("C:/Users/SWARAJ/Documents/dateUtil.ser")));
		oos.writeObject(dateUtils);
		DateUtils dateUtils1 = null;
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(new File("C:/Users/SWARAJ/Documents/dateUtil.ser")));
		dateUtils1 = (DateUtils) ois.readObject();
		oos.close();
		ois.close();
		System.out.println(dateUtils == dateUtils1);
	}

}
