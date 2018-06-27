package org.learn.java.Proxy;


public class BookParser implements IBookParser{
	
	String StringRepresentationBook = null;
	
	public BookParser(String bookName) {
		
		// does expensive parsing, performance wise  
		StringRepresentationBook = "Complete BookName as a gigantic String ";
		
	}
	
	// there may be many similar requests as below
	public int getNoPages() {
		return 0;
	}

}
