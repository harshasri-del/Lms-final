package com.lms.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="book_id")
	private long id;
	@Column(name="book_name")
	private String name;
	@Column(name="author")
	private String author;
	@Column(name="description")
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy ="book" )
	private List<BorrowedBooks> borrowedBooks;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<BorrowedBooks> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(List<BorrowedBooks> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	
	
	

}
