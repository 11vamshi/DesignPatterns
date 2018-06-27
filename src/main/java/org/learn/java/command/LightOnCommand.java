package org.learn.java.command;

public class LightOnCommand implements ICommand {

	private Light light = null;

	public LightOnCommand(Light l) {
		super();
		this.light = l;
	}

	public void execute() {
		this.light.On();
	}

	public void unexecute() {
		this.light.Off();
	}

}
