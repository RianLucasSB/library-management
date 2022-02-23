package com.rian.libraryproject.librarymanagement.controller;

import com.rian.libraryproject.librarymanagement.entities.Author;
import com.rian.libraryproject.librarymanagement.entities.Book;
import com.rian.libraryproject.librarymanagement.service.AuthorService;
import com.rian.libraryproject.librarymanagement.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;
    private final AuthorService authorService;

    @GetMapping
    public ResponseEntity<List<Book>> findAll(){
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        return new ResponseEntity<>(bookService.save(book), HttpStatus.CREATED);
    }

    @PutMapping("/{authorId}/authors/{bookId}")
    public Book registerAuthorToBook(@PathVariable Long authorId, @PathVariable Long bookId){
        Author author = authorService.findById(authorId);
        Book book = bookService.findById(bookId);
        book.registerAuthor(author);
        return bookService.save(book);
    }

    @PutMapping("/{bookId}")
    public ResponseEntity<Book> updateBook(@PathVariable Long bookId, @RequestBody Book book){
        return new ResponseEntity<>(bookService.updateBook(bookId, book), HttpStatus.OK);
    }

}