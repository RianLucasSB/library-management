package com.rian.libraryproject.librarymanagement.repository;

import com.rian.libraryproject.librarymanagement.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
