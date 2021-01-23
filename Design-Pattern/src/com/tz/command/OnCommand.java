package com.tz.command;

public class OnCommand implements Command {

	
	Television televison;
	/**
	 * 
	 */
	public OnCommand(Television televison) {
		this.televison=televison;
	}

	@Override
	public void execute() {
		televison.on();
		
	}
	

}
