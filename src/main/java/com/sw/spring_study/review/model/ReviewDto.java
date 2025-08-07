package com.sw.spring_study.review.model;

import lombok.Getter;

public class ReviewDto {

    @Getter
    public static class Register {
        private String contents;
        private int score;
        private int bookIdx;

        public Review toEntity() {
            return Review.builder()
                    .contents(contents)
                    .score(score)
                    .book(Book.builder().idx(bookIdx))
                    .build();
        }
    }
}
