package com.my.command;

public class ChangeCommand implements Command {

	private TerisMachine machine;
	
	
	public ChangeCommand(TerisMachine machine) {
		super();
		this.machine = machine;
	}


	public void execte() {
		// TODO Auto-generated method stub
		machine.changShape();
	}

}
