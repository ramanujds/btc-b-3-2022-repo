package com.xyz.bookstore.service;

import com.xyz.bookstore.model.Book;

public class BookStore {

	private String bookStoreName;
	private String bookStoreId;
	private Book[] books;

	public BookStore() {
	}

	public BookStore(String bookStoreName, String bookStoreId, Book[] books) {
		super();
		this.bookStoreName = bookStoreName;
		this.bookStoreId = bookStoreId;
		this.books = books;
	}

	public String getBookStoreName() {
		return bookStoreName;
	}

	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}

	public String getBookStoreId() {
		return bookStoreId;
	}

	public void setBookStoreId(String bookStoreId) {
		this.bookStoreId = bookStoreId;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	// Function to calculate the discount for a genre of books
	public float calculateDiscount(Book book, float discountPercentage) {
		
		if(book.getGenre().equalsIgnoreCase("fiction")) {
			float discount = book.getPrice()*(discountPercentage)/100F;
			book.setPrice(book.getPrice()-discount);
			
			return discount;
		}
		
		return 0;
	}

}
