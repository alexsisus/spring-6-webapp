package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {

    @Id
    private int id;

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "author_id"))

    private List<Author> authors;

    private String title;
    private String isbn;
}
