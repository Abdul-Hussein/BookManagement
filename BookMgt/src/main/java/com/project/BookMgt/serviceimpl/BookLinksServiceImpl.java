package com.project.BookMgt.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.BookMgt.dto.BookLinksDto;
import com.project.BookMgt.model.BookLinks;
import com.project.BookMgt.repository.BookLinkRepository;
import com.project.BookMgt.servie.BookLinksService;

@Service
public class BookLinksServiceImpl implements BookLinksService {

	@Autowired
	BookLinkRepository links;
	@Override
	public boolean saveBookLinks(BookLinksDto bookLinksDto) {
		try {
			BookLinks ob = new BookLinks();
			ob.setDate(bookLinksDto.getDate());
			ob.setLinks(bookLinksDto.getLinks());
			ob.setBookName(bookLinksDto.getBookName());
			links.save(ob);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}


	@Override
	public boolean updateBookLinks(BookLinksDto bookLinksDto) {
		try {
			Optional<BookLinks> ob = links.findById(bookLinksDto.getId());
			ob.get().setDate(bookLinksDto.getDate());
			ob.get().setLinks(bookLinksDto.getLinks());
			ob.get().setBookName(bookLinksDto.getBookName());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<BookLinks> getBookLinks() {
		return links.findAll();
	}
}
