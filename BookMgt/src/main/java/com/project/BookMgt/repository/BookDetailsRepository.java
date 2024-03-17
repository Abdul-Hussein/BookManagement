package com.project.BookMgt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.BookMgt.model.BookDetails;

public interface BookDetailsRepository extends JpaRepository<BookDetails, Integer> {

	List<BookDetails> findByBookCategoryId(int id);

}
