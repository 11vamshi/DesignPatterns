package org.learn.java.Adapter;

/**
 * @author vamsh
 * 
 *         Adaptor does the job of using some available class and making it
 *         adaptable so that client can use it Here I am using composition
 *         although
 *
 */
public class AdapterForSomeClass implements IClientHandle {

	// composition is compulsory other alternative is to inherit
	// SomeClassNeedToBeUsed (not
	// recommended because it pollutes adapter also prevents creating a generic
	// adapter
	// as below which uses constructor to overwrite default obj. value)

	SomeClassNeedToBeUsed adaptee = new SomeClassNeedToBeUsed();

	public AdapterForSomeClass() {
		super();
	}

	public AdapterForSomeClass(SomeClassNeedToBeUsed obj) {
		super();
		this.adaptee = obj;
	}

	public String AppropriateFormatGenerator(String targetFormat) {
		String result = adaptee.XmlGenerator();
		System.out.println("but my apapter is capable of converting xml to target Format ");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("Adapter class Converting xml to target Format");

		if (targetFormat == "Json")
			result = "result: some result";
		else if (targetFormat == "Csv")
			result = "result is some result,";
		return result;

	}

	// honestly I don't do anything unlike previous method except delegating to appropriate 
	// method in adaptee
	public void JustDelegatingMethod() {
		
		adaptee.AnyOtherMethod();
	}

}
