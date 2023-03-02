package com.cisco.api.book.dao;
import org.springframework.data.repository.CrudRepository;
import com.cisco.api.book.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	public Book findById(int id);

}
