package com.project.BookMgt.servie;

import java.util.List;

import com.project.BookMgt.dto.BookLinksDto;
import com.project.BookMgt.model.BookLinks;

public interface BookLinksService {
	boolean saveBookLinks(BookLinksDto bookCategoryDto);
	boolean updateBookLinks(BookLinksDto bookLinks);
	List<BookLinks> getBookLinks();
}
