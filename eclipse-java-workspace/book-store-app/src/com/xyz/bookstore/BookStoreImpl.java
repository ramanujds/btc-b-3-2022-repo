package com.xyz.bookstore;

import com.xyz.bookstore.model.Author;
import com.xyz.bookstore.model.Book;
import com.xyz.bookstore.service.BookStore;

public class BookStoreImpl {

	public static void main(String[] args) {
		
		// Declare and initialize author, book and bookstore objects
		
		Author author1 = new Author("Steve", "USA");
		Author author2 = new Author("Harsh","India");
		Author author3 = new Author("Darwin","Africa");
		
		Book b1 = new Book(100987654, "Computer Networks", author1, "technology", 600);
		Book b2 = new Book(675535352, "Vampire  Diaries", author2, "fiction", 750);
		Book b3 = new Book(1637637, "The Origin of Species", author3, "adventure", 820);
		
		Book[] books = {b1,b2,b3};
		
		BookStore bookStore = new BookStore();
		bookStore.setBookStoreId("bs10018");
		bookStore.setBookStoreName("Royal Bokk Store");
		bookStore.setBooks(books);
		
        //Display book details before discount is calculated
		System.out.println("Books Avaliable : ");
		for(Book book:bookStore.getBooks()) {
			System.out.println(book);
		}
		
        //Calculate discount on the books by calling the methods
		
		for(Book book:bookStore.getBooks()) {
			bookStore.calculateDiscount(book, 25);
		}
		
		System.out.println("-------------------------");
		
		//Display book details after discount is calculated
		System.out.println("Books After Discount : ");
		for(Book book:bookStore.getBooks()) {
			System.out.println(book);
		}

       
		
	}
	
}
