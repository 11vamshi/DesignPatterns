package org.learn.java.command;

public class ClientProgram {

	public static void main(String[] args) {
		
		Light light = new Light();
		ICommand on = new LightOnCommand(light);
		ICommand off = new LightOffCommand(light);
		ICommand dimUp = new DimUpCommand(light);
		ICommand dimDown = new DimDownCommand(light);
		
		Invoker invoker = new Invoker(on,off,dimUp,dimDown);
		
		
		// now u can do whatever u want
		/*Regarding the Undo & Re-do via the Command pattern, you would have 2 stacks.  When you perform an 
		action you push it onto the Unto stack and clear the R-do stack.  If you undo something you pop it
		off the Undo stack, undo it, and push it onto the Re-do stack.  If you re-do something you pop it off 
		the Re-do stack, do it, and push it back onto the Undo stack.*/﻿
	
		
	}

}
