package org.learn.java.Decorator;


public class Espresso extends Beverage{

	@Override
	public int cost() {
		// cuz this is baseline ,inner most thing, actual beverage, we return 1
		return 1;
	}

	
	
}
