package com.project.BookMgt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.BookMgt.model.BookLinks;

public interface BookLinkRepository extends JpaRepository<BookLinks, Integer> {

}
