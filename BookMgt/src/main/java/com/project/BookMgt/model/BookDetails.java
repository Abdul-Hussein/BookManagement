package com.project.BookMgt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table
@Entity(name = "book_details")
public class BookDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "Id")
	private int id;

	@Column(name = "book_name")
	private String bookName;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "Price")
	private double price;

	@ManyToOne
	@JoinColumn(name = "book_category_id")
	private BookCategory bookCategory;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public BookCategory getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}

}
