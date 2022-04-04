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

@Table(name="users")
@Entity
public class User {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="user_id")
	private long id;
	private String name;
	private boolean isAdmin;
	@OneToMany(cascade = CascadeType.ALL,mappedBy ="user" )
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
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public List<BorrowedBooks> getBorrowedBooks() {
		return borrowedBooks;
	}
	public void setBorrowedBooks(List<BorrowedBooks> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	

}


