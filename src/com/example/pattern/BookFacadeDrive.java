package com.example.pattern;

public class BookFacadeDrive {
	public static void main(String[] args) {
		BookFacadeProxy bookFacadeProxy = new BookFacadeProxy(new BookFacadeImpl());
		BookFacade bookFacade = (BookFacade) bookFacadeProxy.bind();
		bookFacade.addBook();
		
	}
}
