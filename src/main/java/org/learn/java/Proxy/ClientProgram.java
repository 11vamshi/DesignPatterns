package org.learn.java.Proxy;

public class ClientProgram {

	public static void main(String[] args) {
		LazyBookParser proxy = new LazyBookParser("bookName");
		
		// now client can pass around and play around with proxy but our
		// real parser will be created only when it is really needed

	}

}
