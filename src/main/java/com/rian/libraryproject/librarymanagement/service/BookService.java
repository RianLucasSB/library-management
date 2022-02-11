package com.rian.libraryproject.librarymanagement.service;

import com.rian.libraryproject.librarymanagement.entities.Book;
import com.rian.libraryproject.librarymanagement.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public Book save(Book book){
        return bookRepository.save(book);
    }

    public Book findById(Long bookId) {
        return bookRepository.findById(bookId).get();
    }
}
