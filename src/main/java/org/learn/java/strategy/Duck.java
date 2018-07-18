package org.learn.java.strategy;

public class Duck {
	
	// never underestimate the power of semantics, in your program make sure u use proper variable names
	
	IFlyStrategy iFlyStrategy; //= can initialize but it would not be that flexible, 
							   // significantly less composable
								 // we need to inject not hard code
	
							   // class explosion is possible if we keep on adding all possible strategies

	IDisplayStrategy iDisplayStrategy;
	IQuackStrategy iQuackStrategy;
	
	
	
	//constructor injection
	public Duck(IFlyStrategy iFlyStrategy, IDisplayStrategy iDisplayStrategy, IQuackStrategy iQuackStrategy) {
		super();
		this.iFlyStrategy = iFlyStrategy;
		this.iDisplayStrategy = iDisplayStrategy;
		this.iQuackStrategy = iQuackStrategy;
	}
	
	//below name could be named execute if this class was a button
	public void Fly() {
		this.iFlyStrategy.Fly();
	}
	//below name could be named execute if this class was a button
	public void Quack() {
		this.iQuackStrategy.Quack();
	}
	//below name could be named execute if this class was a button
	public void Display() {
		this.iDisplayStrategy.Display();
	}
}
