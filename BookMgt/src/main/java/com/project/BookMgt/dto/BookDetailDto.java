package com.project.BookMgt.dto;

import com.project.BookMgt.model.BookCategory;

public class BookDetailDto {
private int id;
private String bookName;
private String remarks;
private double bookPrice;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}
public double getBookPrice() {
	return bookPrice;
}
public void setBookPrice(double bookPrice) {
	this.bookPrice = bookPrice;
}




}
