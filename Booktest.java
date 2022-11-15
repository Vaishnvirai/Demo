package com.chainsys.day2;

public class Booktest {

	public static void main(String[] args) {
		Book book1=new Book();
		book1.authorName="Kalki";
		book1.bookName="Ponniyin Selvan";
		book1.bookNo=12345;
		book1.publishedYear=1954;
		book1.rating=9.8f;
		System.out.println(book1.authorName);
		System.out.println(book1.bookName);
		System.out.println(book1.bookNo);
		System.out.println(book1.publishedYear);
		System.out.println(book1.rating);
	}

}
