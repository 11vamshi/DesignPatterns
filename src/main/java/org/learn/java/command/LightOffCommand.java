package org.learn.java.command;

public class LightOffCommand implements ICommand {

	private Light light = null;

	public LightOffCommand(Light l) {
		super();
		this.light = l;
	}

	public void execute() {
		this.light.Off();
	}

	public void unexecute() {
		this.light.On();

	}

}
