package com.lms.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="borrowed_books")
@Entity
public class BorrowedBooks {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="borrowedbook_id")
	private long borrowedBooksId;
	@ManyToOne
    @JoinColumn(name="book_id")
    private Book book;
	
	@ManyToOne
    @JoinColumn(name="user_id")
	private User user;
	@Column(name="return_date")
	private Date returnByDate;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getReturnByDate() {
		return returnByDate;
	}
	public void setReturnByDate(Date returnByDate) {
		this.returnByDate = returnByDate;
	}
	public long getBorrowedBooksId() {
		return borrowedBooksId;
	}
	public void setBorrowedBooksId(long borrowedBooksId) {
		this.borrowedBooksId = borrowedBooksId;
	}
	

}
