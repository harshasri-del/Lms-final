package com.lms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.exception.ResourceNotFoundException;
import com.lms.model.Book;
import com.lms.repository.BookRepository;

@RestController
@RequestMapping("/api/v1/")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	@PostMapping("/books")
	public Book createBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable Long id) {
		Book book = bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Book not exist with id :" + id));
		return ResponseEntity.ok(book);
	}
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		Book book = bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		bookRepository.delete(book);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}
