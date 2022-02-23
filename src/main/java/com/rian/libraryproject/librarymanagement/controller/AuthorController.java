package com.rian.libraryproject.librarymanagement.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@RequiredArgsConstructor
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;
    private final BookService bookService;

    @GetMapping
    public ResponseEntity<List<Author>> findAll(){
        return new ResponseEntity<>(authorService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Author> saveAuthor(@RequestBody Author author){
        return new ResponseEntity<>(authorService.save(author), HttpStatus.CREATED);
    }


}