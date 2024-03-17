package com.project.BookMgt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="book_category")
public class BookCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name="name", unique=true)
	private String name;
	@Column(name = "created_by")
	private String created_by;
	@Column(name="created_Date")
	private int created_Date;
	@Column(name = "modified_by")
	private String modified_by;
	@Column(name = "modified_date")
	private int modified_date;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public int getModified_date() {
		return modified_date;
	}

	public void setModified_date(int modified_date) {
		this.modified_date = modified_date;
	}
	public int getCreated_Date() {
		return created_Date;
	}

	public void setCreated_Date(int created_Date) {
		this.created_Date = created_Date;
	}

}
