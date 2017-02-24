package com.gurusader.designpatterns.iterator;

// ConcreteAggregate
public class BookShelf implements Aggregate {
	private Book[] books;
	private int numOfBooks;

	public BookShelf(int maxSize) {
		books = new Book[maxSize];
		numOfBooks = 0;
	}

	public void addBook(Book book) {
		if (numOfBooks < books.length) {
			books[numOfBooks] = book;
			numOfBooks++;
		}
	}

	public Book getBookAt(int index) {
		Book book = null;

		if (index < numOfBooks) {
			book = books[index];
		}

		return book;
	}

	public int getNumOfBooks() {
		return numOfBooks;
	}

	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}
}
