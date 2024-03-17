package com.project.BookMgt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;
@Controller
public class NavigationLinksController {

@GetMapping("/bookLinks")

public String displayBookLinks(Model model) {
	return "user/bookLinks";
}
}

//Reviewed applciation properties
//Changed id to long in the jpa, dto and bookLinks class
//No direct mapping in pom xml
