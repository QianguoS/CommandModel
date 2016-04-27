package com.my.command;

public class Buttons {

	private LeftCommand leftCommand;
	private RightCommand rightCommand;
	private FastCommand fastCommand;
	private ChangeCommand changeCommand;
	public void setLeftCommand(LeftCommand leftCommand) {
		this.leftCommand = leftCommand;
	}
	public void setRightCommand(RightCommand rightCommand) {
		this.rightCommand = rightCommand;
	}
	public void setFastCommand(FastCommand fastCommand) {
		this.fastCommand = fastCommand;
	}
	public void setChangeCommand(ChangeCommand changeCommand) {
		this.changeCommand = changeCommand;
	}
	
	public void toLeft(){
		leftCommand.execte();
	}
	public void toRight(){
		rightCommand.execte();
	}
	public void fastBottom(){
		fastCommand.execte();
	}
	public void changeShape(){
		changeCommand.execte();
	}
}
