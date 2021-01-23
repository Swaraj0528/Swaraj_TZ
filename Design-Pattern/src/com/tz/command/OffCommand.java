package com.tz.command;

public class OffCommand implements Command {

	
	Television televison;
	/**
	 * 
	 */
	public OffCommand(Television televison) {
		this.televison=televison;
	}

	@Override
	public void execute() {
		televison.off();
		
	}
	

}
