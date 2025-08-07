package com.sw.spring_study.review;

import com.sw.spring_study.book.model.Book;
import jakarta.persistence.*;

@Entity
public class Review {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;
    private String contents;
    private int score;

    @ManyToOne
    @JoinColumn(name = "book_idx")
    private Book book;
}
