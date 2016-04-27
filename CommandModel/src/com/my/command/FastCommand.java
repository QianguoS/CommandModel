package com.my.command;

public class FastCommand implements Command {

	private TerisMachine machine;
	
	public FastCommand(TerisMachine machine) {
		super();
		this.machine = machine;
	}

	public void execte() {
		// TODO Auto-generated method stub
		machine.fastBottom();
	}

}
