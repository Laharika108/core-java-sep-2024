package com.bms.dao;

import java.util.HashSet;
import java.util.Set;

import com.bms.model.BookPojo;

public class BookDaoImpl implements BookDao {
	Set<BookPojo> BookDataStore;
	public BookDaoImpl() {
		BookDataStore = new HashSet<>();
		BookPojo book1 = new BookPojo(101, "Harry Potter and the Order of Phonenix", "J.K.Rowling", "Fiction", 300, "")	;
		BookPojo book2 = new BookPojo(102, "Harry Potter and the Order of Phone", "K.Rowling", "Action", 100, "")	;
		BookPojo book3 = new BookPojo(103, "Harry Potter and the Order of nix", "Rowling", "Fiction", 350, "")	;
		BookDataStore.add(book1);
		BookDataStore.add(book2);
		BookDataStore.add(book3);
	}

	@Override
	public Set<BookPojo> fetchAllBooks(int BookId) {
		// TODO Auto-generated method stub
		return BookDataStore;
	}

	@Override
	public BookPojo fetchABook(int BookId) {
		BookPojo returnBookPojo = null;
		for (BookPojo eachbook : BookDataStore) {
			if(eachbook.getBookId() == BookId) {
				returnBookPojo = eachbook;
				break;
			}
		}
		return returnBookPojo;
	}

	@Override
	public Set<BookPojo> fetchByGener(String BookGener) {
		Set<BookPojo> allBooksByGener = new HashSet<>();
		for(BookPojo eachBook: BookDataStore) {
			if(eachBook.getBookGener().equals(BookGener)) {
			allBooksByGener.add(eachBook);	
		}
	}
		return allBooksByGener;
	}
	@Override
	public BookPojo addBook(BookPojo newBook) {
		int maxBookId = 0;
		for(BookPojo eachBook : BookDataStore) {
			if(eachBook.getBookId() > maxBookId) {
				maxBookId = eachBook.getBookId();
			}
		}
		newBook.setBookId(maxBookId + 1);
		BookDataStore.add(newBook);
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo editBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(int BookId) {
		BookDataStore.removeIf((eachBook) -> eachBook.getBookId() == BookId);
		
	}

}
