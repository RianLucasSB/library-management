package com.rian.libraryproject.librarymanagement.service;

import com.rian.libraryproject.librarymanagement.entities.Author;
import com.rian.libraryproject.librarymanagement.entities.Book;
import com.rian.libraryproject.librarymanagement.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    public List<Author> findAll(){
        return authorRepository.findAll();
    }

    public Author save(Author author){
        return authorRepository.save(author);
    }

    public Author findById(Long authorId) {
        return authorRepository.findById(authorId).get();
    }
}