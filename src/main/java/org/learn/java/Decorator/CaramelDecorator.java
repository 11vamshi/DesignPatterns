package org.learn.java.Decorator;

/**
 * @author vamshi krishna
 * 
 * by proxy caramel decorator is a beverage, by that idea,this decorator is a 
 * component. has a beverage(component) is satisfied by member variable,
 * decorator can't standalone 
 */

public class CaramelDecorator extends AddonDecorator{
	
	Beverage beverage;

	public CaramelDecorator(Beverage b) {
		beverage = b;
	}
	@Override
	public int cost() {
		// let's say caramel is 2 units
		return this.beverage.cost()+2;
	}
	

}
