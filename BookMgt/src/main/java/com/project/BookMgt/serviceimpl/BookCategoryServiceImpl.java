package com.project.BookMgt.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.BookMgt.dto.BookCategoryDto;
import com.project.BookMgt.model.BookCategory;
import com.project.BookMgt.model.BookDetails;
import com.project.BookMgt.repository.BookCategoryRepository;
import com.project.BookMgt.servie.BookCategoryService;

@Service
public class BookCategoryServiceImpl implements BookCategoryService {
	@Autowired
	BookCategoryRepository bookCategoryRepository;
	
	@Override
	public boolean saveBookCategory(BookCategoryDto bookCategoryDto) {
		try {
			BookCategory ob = new BookCategory();
			ob.setCreated_Date(bookCategoryDto.getCreated_Date());
			ob.setCreated_by(bookCategoryDto.getCreated_by());
			ob.setModified_by(bookCategoryDto.getModified_by());
			ob.setModified_date(bookCategoryDto.getModified_date());
			ob.setName(bookCategoryDto.getName());
			ob.setId(bookCategoryDto.getId());
			
			bookCategoryRepository.save(ob);
		} 
		catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateCategoryDetails(BookCategoryDto bookCategoryDto) {
try {
	Optional<BookCategory> bookCategory= bookCategoryRepository.findById(bookCategoryDto.getId());
		bookCategory.get().setCreated_by(bookCategoryDto.getCreated_by());
		bookCategory.get().setCreated_Date(bookCategoryDto.getCreated_Date());
		bookCategory.get().setModified_by(bookCategoryDto.getModified_by());
		bookCategory.get().setModified_date(bookCategoryDto.getModified_date());
		bookCategory.get().setName(bookCategoryDto.getName());
		bookCategoryRepository.save(bookCategory.get());
}
catch(Exception e){
	e.printStackTrace();
	return false;
}
return true;
	}

	@Override
	public List<BookCategory> getBookCategory() {
		List<BookCategory> bookCategory= bookCategoryRepository.findAll();
		return bookCategory;
		
	}
	

	@Override
	public BookCategory getBookCategoryById(Integer id) {
	    return bookCategoryRepository.findById(id).orElse(null);
	}


}
