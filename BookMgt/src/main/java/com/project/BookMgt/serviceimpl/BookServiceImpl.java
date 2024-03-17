package com.project.BookMgt.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.BookMgt.dto.BookDetailDto;
import com.project.BookMgt.model.BookDetails;
import com.project.BookMgt.repository.BookDetailsRepository;
import com.project.BookMgt.servie.BookService;

@Service // Indication of a business layer to the container
public class BookServiceImpl implements BookService {
	@Autowired
	BookDetailsRepository bookDetailsRepository;

	@Override
	public String getBookMessage() {
		return "Improve your knowledge";

	}

	@Override
	public boolean saveBookDetails(BookDetailDto bookDetailDto) {
		try {
			BookDetails ob = new BookDetails();
			ob.setBookName(bookDetailDto.getBookName());
			ob.setPrice((int) bookDetailDto.getBookPrice());
			ob.setRemarks(bookDetailDto.getRemarks());
			bookDetailsRepository.save(ob);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	@Override
	public List<BookDetails> getBookDetails() {
		List<BookDetails> bookDetails = bookDetailsRepository.findAll();
		return bookDetails;
	}

	@Override
	public boolean updateBookDetails(BookDetailDto bookDetailDto) {
		try {
			Optional<BookDetails> bookDetails = bookDetailsRepository.findById(bookDetailDto.getId());
			bookDetails.get().setBookName(bookDetailDto.getBookName());
			bookDetails.get().setRemarks(bookDetailDto.getRemarks());
			bookDetails.get().setPrice(bookDetailDto.getBookPrice());
			bookDetailsRepository.save(bookDetails.get());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public BookDetails getBookDetailsById(Integer id) {
		Optional<BookDetails> bookDetails = bookDetailsRepository.findById(id);
		return bookDetails.get();

	}

	@Override
	public List<BookDetails> getBookCategoryById(int id) {
		List<BookDetails>response=bookDetailsRepository.findByBookCategoryId(id);
		return response;
	}

}
