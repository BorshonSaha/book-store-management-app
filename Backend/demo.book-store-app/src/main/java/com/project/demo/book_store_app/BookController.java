package com.project.demo.book_store_app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@PostMapping("/books")
	public Book createBook(@RequestBody Book book) {
		Book savedBook = bookRepository.save(book);
		return savedBook;
	}
	
	@GetMapping("/books")
	public List<Book> retriveAllBooks() {
		return bookRepository.findAll();
	}
}
