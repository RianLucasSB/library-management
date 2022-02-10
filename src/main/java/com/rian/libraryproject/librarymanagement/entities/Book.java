package com.rian.libraryproject.librarymanagement.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_book")
@Data
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String publisher;
    private String image;
    @ManyToMany(mappedBy = "writtedBooks")
    private List<Author> authors = new ArrayList<>();

    public void addAuthor(Author author){
        authors.add(author);
    }
}
