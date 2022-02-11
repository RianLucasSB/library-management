package com.rian.libraryproject.librarymanagement.repository;

import com.rian.libraryproject.librarymanagement.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
