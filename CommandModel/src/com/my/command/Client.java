package com.my.command;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TerisMachine machine = new TerisMachine();
		
		LeftCommand leftCommand = new LeftCommand(machine);
		RightCommand rightCommand = new RightCommand(machine);
		FastCommand fastCommand = new FastCommand(machine);
		ChangeCommand changeCommand = new ChangeCommand(machine);
		
		Buttons buttons = new Buttons();
		buttons.setLeftCommand(leftCommand);
		buttons.setRightCommand(rightCommand);
		buttons.setFastCommand(fastCommand);
		buttons.setChangeCommand(changeCommand);
		
		buttons.toLeft();
		buttons.toRight();
		buttons.fastBottom();
		buttons.changeShape();
	}

}
