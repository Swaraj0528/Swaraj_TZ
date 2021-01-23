package com.tz.command;

public class RemoteControl {

	private Command comm;
	public void pressButton() {
		comm.execute();
	}

	public Command getComm() {
		return comm;
	}

	public void setComm(Command comm) {
		this.comm = comm;
	}
}
