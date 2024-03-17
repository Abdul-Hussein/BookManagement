package com.project.BookMgt.servie;

import java.util.List;

import com.project.BookMgt.dto.BookCategoryDto;
import com.project.BookMgt.model.BookCategory;
import com.project.BookMgt.model.BookDetails;

public interface BookCategoryService {
	boolean saveBookCategory(BookCategoryDto bookCategoryDto);
	boolean updateCategoryDetails(BookCategoryDto bookCategoryDto);
	List<BookCategory> getBookCategory();
	BookCategory getBookCategoryById(Integer id);
}
