package com.gurusader.designpatterns.iterator;

public class TestIteratorPattern {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(10);
		bookShelf.addBook(new Book("The C Programming Language"));
		bookShelf.addBook(new Book("The C++ Programming Language"));
		bookShelf.addBook(new Book("The Java Programming Language"));
		bookShelf.addBook(new Book("Programming in Scala"));

		Iterator<Book> iterator = bookShelf.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.getNext().getTitle());
		}
	}
}
