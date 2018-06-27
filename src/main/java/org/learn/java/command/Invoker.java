package org.learn.java.command;

public class Invoker {
	private ICommand On;
	private ICommand Off;
	private ICommand DimUp;
	private ICommand DimDown;

	public Invoker(ICommand on, ICommand off, ICommand dimUp, ICommand dimDown) {
		super();
		this.On = on;
		this.Off = off;
		this.DimUp = dimUp;
		this.DimDown = dimDown;
	}

	public void pressOn() {
		this.On.execute();
	}
	
	public void UndopressOn() {
		this.On.unexecute();
	}

	public void pressOff() {
		this.Off.execute();
	}
	
	public void UndopressOff() {
		this.Off.unexecute();
	}
	
	public void pressDimUp() {
		this.DimUp.execute();
	}
	public void UndoDimUp() {
		this.DimUp.unexecute();
	}
	
	public void pressDimDown() {
		this.DimDown.execute();
	}
	public void UndoDimDown() {
		this.DimDown.unexecute();
	}
	
}
