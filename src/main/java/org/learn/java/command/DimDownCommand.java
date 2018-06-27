package org.learn.java.command;

public class DimDownCommand implements ICommand {

	private Light light = null;

	public DimDownCommand(Light l) {
		super();
		this.light = l;
	}

	public void execute() {
		this.light.DimDown();
	}

	public void unexecute() {
		this.light.DimUp();

	}

}
