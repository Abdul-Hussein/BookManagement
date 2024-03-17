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

import com.project.BookMgt.dto.BookDetailDto;
import com.project.BookMgt.model.BookDetails;
import com.project.BookMgt.servie.BookService;

//http://localhost:8082/book-mgmt/books/message
@Controller
@RequestMapping("/books")
public class BookController {
	@Autowired
	BookService service;
	
	@RequestMapping(value = "/saveBookDetails", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public boolean saveBookDetails(@RequestBody BookDetailDto bookDetailDto) {
		boolean response = service.saveBookDetails(bookDetailDto);
		return response;
	}

	@GetMapping("/message")
	public ResponseEntity<String> getBookMessage() {
		String response = service.getBookMessage();
		return ResponseEntity.ok(response);
	}

	@GetMapping("/getBookDetails")
	@ResponseBody
	public List<BookDetails> getBookDetails() {
		List<BookDetails> bookDetails = service.getBookDetails();
		return bookDetails;

	}
	
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<String> userAccess() {
		
		String response = "Book management";
			
		return ResponseEntity.ok(response);
	}

	@RequestMapping(value = "/updateDetails", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public boolean updateBookDetails(@RequestBody BookDetailDto bookDetailDto) {
		boolean response = service.updateBookDetails(bookDetailDto);
		return response;
	}

	@RequestMapping(value = "/getBookDetailsbyId", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public BookDetails getBookDetailsById(@RequestParam Integer id) {
		BookDetails response = (BookDetails) service.getBookDetailsById(id);
		return response;
	}
	@RequestMapping(value = "/getBookDetailsbyCategory", method = { RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public List<BookDetails> getBookCategoryById(@RequestParam int id) {
		List<BookDetails> bookDetails = service.getBookCategoryById(id);
		return bookDetails;
	}

}
