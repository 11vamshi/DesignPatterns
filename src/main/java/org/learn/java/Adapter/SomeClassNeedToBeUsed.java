package org.learn.java.Adapter;

/**
 * @author vamsh
 * Also called Adaptee
 * Usually only .class file of this class is available  ( may be our vendor's class )
 * so basically no one in our company can modify it
 * but we have to make it available to our clientProgram.
 *  
 * This class can also be some legacy class which has to be used
 *
 */
public class SomeClassNeedToBeUsed {
	public String XmlGenerator(){
		System.out.println(" Adaptee class is capable of generating only Xml");
		return "<result> some result </result>";
	}

	public void AnyOtherMethod() {
		
		System.out.println(" Just to call me you might need an adapter class some times");
		
		
	}
}
