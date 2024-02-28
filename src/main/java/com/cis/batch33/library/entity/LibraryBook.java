package com.cis.batch33.library.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Table(name="book")
@Entity
@Data
public class LibraryBook {
    @Id
    @Column(name="book_id")
    private Integer bookid;

    @Column(name="title")
    private String title;

    @Column(name="author_name")
    private String authorname;

    @Column(name="year_published")
    private Integer yearpublished;

    @Column(name="quantity")
    private Integer quantity;

}
