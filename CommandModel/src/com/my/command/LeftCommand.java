package com.my.command;

public class LeftCommand implements Command {

	private TerisMachine machine;
	
	public LeftCommand(TerisMachine machine) {
		super();
		this.machine = machine;
	}

	
	public void execte() {
		// TODO Auto-generated method stub
		machine.toLeft();
	}

}
