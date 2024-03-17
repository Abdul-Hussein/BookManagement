package com.project.BookMgt.servie;

import java.util.List;

import com.project.BookMgt.dto.BookCategoryDto;
import com.project.BookMgt.dto.BookDetailDto;
import com.project.BookMgt.model.BookDetails;
import com.project.BookMgt.repository.BookDetailsRepository;

public interface BookService {
	
	String getBookMessage();
	boolean saveBookDetails(BookDetailDto bookDetailDto);
	boolean updateBookDetails(BookDetailDto bookDetailDto);
	List<BookDetails> getBookDetails();
	BookDetails getBookDetailsById(Integer id);
	 List<BookDetails> getBookCategoryById(int id); 
	
}
