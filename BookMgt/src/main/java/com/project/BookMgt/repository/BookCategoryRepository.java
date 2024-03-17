package com.project.BookMgt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.BookMgt.model.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer> {

}
