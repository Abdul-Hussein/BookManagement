package com.project.BookMgt.dto;

public class BookCategoryDto {
	private int id;
	private String name;
	private String created_by;
	private int created_Date;
	private String modified_by;
	private int modified_date; 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public int getCreated_Date() {
		return created_Date;
	}
	public void setCreated_Date(int created_Date) {
		this.created_Date = created_Date;
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
}
//Save the book category details 
//
