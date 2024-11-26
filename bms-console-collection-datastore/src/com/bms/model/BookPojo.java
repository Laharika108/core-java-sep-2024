package com.bms.model;

import java.util.Objects;

public class BookPojo {
	private int BookId;
	private String BookTitle;
	private String BookAuthor;
	private String BookGener;
	private int BookPrice;
	private String ImgUrl;
	public BookPojo(int bookId, String bookTitle, String bookAuthor, String bookGener, int bookPrice, String imgUrl) {
		super();
		this.BookId = bookId;
		this.BookTitle = bookTitle;
		this.BookAuthor = bookAuthor;
		this.BookGener = bookGener;
		this.BookPrice = bookPrice;
		this.ImgUrl = imgUrl;
	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
		
	}
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public String getBookGener() {
		return BookGener;
	}
	public void setBookGener(String bookGener) {
		BookGener = bookGener;
	}
	public int getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(int bookPrice) {
		BookPrice = bookPrice;
	}
	public String getImgUrl() {
		return ImgUrl;
	}
	public void setImgUrl(String imgUrl) {
		ImgUrl = imgUrl;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(BookId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookPojo other = (BookPojo) obj;
		return BookId == other.BookId;
	}
	@Override
	public String toString() {
		return "BookPojo [BookId=" + BookId + ", BookTitle=" + BookTitle + ", BookAuthor=" + BookAuthor + ", BookGener="
				+ BookGener + ", BookPrice=" + BookPrice + ", ImgUrl=" + ImgUrl + "]";
	}
	
	
	
}
