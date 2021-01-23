package com.tz.adapterPattern;

public class WeatherAdapter {

	public int findTemprature(int zipCode) {
		String city = null;
		
		if (zipCode == 19406) {
			city = "Howrah";
		}
		WeatherFinder wf = new WeatherFinderImpl();
		int temprature = wf.find(city);
		return temprature;

	}

}
