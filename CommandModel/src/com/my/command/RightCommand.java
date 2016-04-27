package com.my.command;

public class RightCommand implements Command {

	private TerisMachine machine;
	
	public RightCommand(TerisMachine machine) {
		super();
		this.machine = machine;
	}

	public void execte() {
		// TODO Auto-generated method stub
		machine.toRight();
	}

}
