package com.bms.dao;

import java.util.Set;

import com.bms.model.BookPojo;

public interface BookDao {
	Set<BookPojo> fetchAllBooks(int BookId);
	BookPojo fetchABook(int BookId);
	Set<BookPojo> fetchByGener(String BookGener);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo editBook);
	void deleteBook(int BookId);

}
