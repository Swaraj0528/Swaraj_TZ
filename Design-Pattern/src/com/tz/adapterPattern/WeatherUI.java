package com.tz.adapterPattern;

public class WeatherUI {
	public void showTemprature(int zipCode) {
		WeatherAdapter wa = new WeatherAdapter();
		wa.findTemprature(zipCode);
		System.out.println(wa.findTemprature(zipCode));
	
	}
	
	 public static void main(String[] args) {
		WeatherUI Ui = new WeatherUI();
		Ui.showTemprature(19406);
		
	}
	
}
