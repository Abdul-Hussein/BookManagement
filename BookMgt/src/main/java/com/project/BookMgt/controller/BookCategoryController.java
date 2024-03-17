package com.project.BookMgt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.BookMgt.dto.BookCategoryDto;
import com.project.BookMgt.model.BookCategory;
import com.project.BookMgt.model.BookDetails;
import com.project.BookMgt.servie.BookCategoryService;

@Controller
@RequestMapping("/bookCategory")
public class BookCategoryController {
	@Autowired
	BookCategoryService service;

	@RequestMapping(value = "/saveBookCategory", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public boolean saveBookCategory(@RequestBody BookCategoryDto bookCategoryDto) {
		boolean response = service.saveBookCategory(bookCategoryDto);
		return response;
	}

	@GetMapping("/getBookCategory")
	@ResponseBody
	public List<BookCategory> getBookCategory() {
		List<BookCategory> bookCategory = service.getBookCategory();

		return bookCategory;

	}
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<String> userAccess() {
		
		String response = "Book management";
			
		return ResponseEntity.ok(response);
	}


	@RequestMapping(value = "/updateBookCategoryDetails", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public boolean updateBookCategory(@RequestBody BookCategoryDto bookCategory) {
		boolean response = service.updateCategoryDetails(bookCategory);
		return response;
	}

	@RequestMapping(value = "/getBookCategoryById", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public BookCategory getBookDetailsById(@RequestParam Integer id) {
		BookCategory response = (BookCategory) service.getBookCategoryById(id);
		return response;
	}

}
