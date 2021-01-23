package com.tz.command;

import java.rmi.Remote;

public class Person {

	public static void main(String[] args) {

		Television televison = new Television();
		RemoteControl rC = new RemoteControl();
		OnCommand on = new OnCommand(televison);
		rC.setComm(on);
		rC.pressButton();
	}

}
