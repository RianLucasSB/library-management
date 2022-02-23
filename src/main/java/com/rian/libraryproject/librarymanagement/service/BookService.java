package com.rian.libraryproject.librarymanagement.service;

import com.rian.libraryproject.librarymanagement.entities.Book;
import com.rian.libraryproject.librarymanagement.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Book updateBook(Long bookId, Book book) {
        Optional<Book> savedBook = bookRepository.findById(bookId);
        Book newBook = Book.builder()
                .id(bookId)
                .title(book.getTitle())
                .publisher(book.getPublisher())
                .image(book.getImage())
                .authors(savedBook.get().getAuthors())
                .build();
        return bookRepository.save(newBook);
    }
}