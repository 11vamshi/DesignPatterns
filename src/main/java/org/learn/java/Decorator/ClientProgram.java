package org.learn.java.Decorator;

public class ClientProgram {
	
	// this is like multiplying variables a*b*c
	// stacking behaviours thus preventing class explosion
	public static void main(String[] args) {
		
		Beverage b = new CaramelDecorator(new Espresso());
		System.out.println(b.cost());
	}

}
