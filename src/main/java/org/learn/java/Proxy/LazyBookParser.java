package org.learn.java.Proxy;

public class LazyBookParser implements IBookParser{

	
	// avoiding creating parser instantly and if we may get lucky
	// bookparser may only be passed around by client for the sake 
	// of it but may never be called
	private BookParser realBookParser= null;
	private String bookName = null;
	
	public LazyBookParser(String bookName) {
		this.bookName = bookName;
	}
	
	public int getNoPages() {
		if(realBookParser == null ) {
			this.realBookParser = new BookParser(bookName);
		}
		return realBookParser.getNoPages();
	}
	
}
