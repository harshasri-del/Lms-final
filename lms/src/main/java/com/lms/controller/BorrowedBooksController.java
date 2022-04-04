package com.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.model.Book;
import com.lms.model.BorrowedBooks;
import com.lms.repository.BorrowedBooksRepository;

@RestController
@RequestMapping("/api/v1/")
public class BorrowedBooksController {
	
	@Autowired
	private BorrowedBooksRepository borrowedBooksRepository;

	
	//@PostMapping("/books")
	public BorrowedBooks createBook(@RequestBody Book book) {
		//return borrowedBooksRepository.save(book);
		return null;
	}
	

}
