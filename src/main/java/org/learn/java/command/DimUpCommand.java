package org.learn.java.command;

public class DimUpCommand implements ICommand {

	private Light light = null;

	public DimUpCommand(Light l) {
		super();
		this.light = l;
	}

	public void execute() {
		this.light.DimUp();
	}

	public void unexecute() {
		this.light.DimDown();

	}

}
