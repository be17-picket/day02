package com.sw.spring_study.review.model;

import com.sw.spring_study.book.model.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;
    private String contents;
    private int score;

    @ManyToOne
    @JoinColumn(name = "book_idx")
    private Book book;
}