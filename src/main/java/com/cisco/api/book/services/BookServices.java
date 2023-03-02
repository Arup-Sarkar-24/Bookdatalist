package com.cisco.api.book.services;
/*
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cisco.api.book.entities.Book;

@Component
public class BookServices {
	private static List<Book> list=new ArrayList<>();
	static {
		list.add(new Book(12224,"Java Tutorial for Bigginers","Arup Sarkar"));
		list.add(new Book(12225,"Java Tutorial for Intermediate","Arup Sarkar"));
		list.add(new Book(12226,"Java Tutorial for Advance","Arup Sarkar"));
		list.add(new Book(12227,"Python Tutorial for Bigginers","Arup Sarkar"));
		list.add(new Book(12228,"Python Tutorial for Intermediate","Arup Sarkar"));
		list.add(new Book(12229,"Python Tutorial for Advance","Arup Sarkar"));
		list.add(new Book(12230,"C++ Tutorial for Bigginers","Arup Sarkar"));
		list.add(new Book(12231,"C++ Tutorial for Intermediate","Arup Sarkar"));
		list.add(new Book(12232,"C++ Tutorial for Advance","Arup Sarkar"));
		list.add(new Book(12233,"C# Tutorial for Bigginers","Arup Sarkar"));
		list.add(new Book(12234,"C# Tutorial for Intermediate","Arup Sarkar"));
		list.add(new Book(12235,"C# Tutorial for Advance","Arup Sarkar"));
		list.add(new Book(12236,"PHP Tutorial for Bigginers","Arup Sarkar"));
		list.add(new Book(12237,"PHP Tutorial for Intermediate","Arup Sarkar"));
		list.add(new Book(12238,"PHP Tutorial for Advance","Arup Sarkar"));
	}
	//get all books
	public List<Book> getAllBooks(){
		return list;
	}
	
	//get book by id
	 public Book getBookById(int id) {
		 Book book=null;
		 try {
			 book=list.stream().filter(e->e.getId()==id).findFirst().get();
		 } catch (Exception e) {
			 e.printStackTrace();
		}
		 return book;
		  
	 }
	 //adding the book
	 public Book addBook(Book b) {
		 list.add(b);
		 return b;
	 }
	 
	 //delete book 
	 public void deleteBook(int bId){
		 list=list.stream().filter(Book ->Book.getId()!=bId).collect(Collectors.toList());	
	}
	 
	 //update the book
	 public void updateBook(Book book, int bookId) {
		 list.stream().map(b->{
			 if(b.getId()==bookId) {
				 b.setTitle(book.getTitle());
				 b.setAuthor(book.getAuthor());
			 }
			 return b;
		 }).collect(Collectors.toList());
		
	}

}
*/
