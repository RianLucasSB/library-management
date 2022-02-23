package com.rian.libraryproject.librarymanagement.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "tb_author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "authors")
    @JsonIgnore
    private List<Book> writtedBooks = new ArrayList<>();

    public void registerBook(Book book) {
        writtedBooks.add(book);
    }
}