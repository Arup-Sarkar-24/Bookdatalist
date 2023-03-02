package com.cisco.api.book.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cisco.api.book.dao.BookRepository;
import com.cisco.api.book.entities.Book;

@Component
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	//get all books
	public List<Book> getAllBooks(){
		List<Book> list= (List<Book>) this.bookRepository.findAll();
		return list;
	}
	
	//get book by id
	 public Book getBookById(int id) {
		 Book book=null;
		 try {
			 book= this.bookRepository.findById(id);
		 } catch (Exception e) {
			 e.printStackTrace();
		}
		 return book;
		  
	 }
	 //adding the book
	 public Book addBook(Book b) {
		 Book result=bookRepository.save(b);
		 return result;
	 }
	 
	 //delete book 
	 public void deleteBook(int bId){
		 bookRepository.deleteById(bId);
	}	 
	 //update the book
	 public void updateBook(Book book, int bookId) {
		 bookRepository.save(book);	
	}

}
