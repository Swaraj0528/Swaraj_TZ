package com.tz.builder;

public class Test {
	public static void main(String[] args) {
		new HttpClient("GET", "test.com", null, null, null, null);
		
		HttpClient client = new HttpClient.HttpClientBuilder().method("PoST").url("Hello r").build();
		System.out.println(client);
		
	}

}
