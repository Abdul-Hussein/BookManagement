package com.project.BookMgt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class NavigationCategoryController {
@GetMapping("/bookCategory")

public String displayBookCategory(Model model) {
	return "user/bookCategory";
	
}
}
