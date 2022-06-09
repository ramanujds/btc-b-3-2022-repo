package com.xyz.bookstore.model;

public class Book {

	private int isbnNo;
	private String bookName;
	private Author author;
	private String genre;
	private float price;
	
	public Book() {
	}

	public Book(int isbnNo, String bookName, Author author, String genre, float price) {
		super();
		this.isbnNo = isbnNo;
		this.bookName = bookName;
		this.author = author;
		this.genre = genre;
		this.price = price;
	}

	public int getIsbnNo() {
		return isbnNo;
	}

	public void setIsbnNo(int isbnNo) {
		this.isbnNo = isbnNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbnNo=" + isbnNo + ", bookName=" + bookName + ", author=" + author + ", genre=" + genre
				+ ", price=" + price + "]";
	}
	
	
	
}
