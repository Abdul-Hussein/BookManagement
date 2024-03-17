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
import org.springframework.web.bind.annotation.ResponseBody;
import com.project.BookMgt.dto.BookLinksDto;
import com.project.BookMgt.model.BookLinks;
import com.project.BookMgt.servie.BookLinksService;

@Controller
@RequestMapping("/bookLinks")
public class BookLinksController {

    @Autowired 
    BookLinksService bookLinks;

    @RequestMapping(value="/saveBookLinks", method = { RequestMethod.POST, RequestMethod.GET })
    @ResponseBody
    public boolean saveBookLinks(@RequestBody BookLinksDto bookCategoryDto) {
        return bookLinks.saveBookLinks(bookCategoryDto);
    }

    @GetMapping("/getBookLinks")
    @ResponseBody
    public List<BookLinks> getBookLinks() {
        return bookLinks.getBookLinks();
    }

	@GetMapping("/user")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<String> userAccess() {
		
		String response = "Book Management";
			
		return ResponseEntity.ok(response);
	}

    @RequestMapping(value="/updateBookLinks", method= {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public boolean updateBookLinks(@RequestBody BookLinksDto bookCategory) {
        return bookLinks.updateBookLinks(bookCategory);
    }   
}
