package com.sw.spring_study.review.model;

import com.sw.spring_study.book.model.Book;
import lombok.Builder;
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
                    .book(Book.builder().idx(bookIdx).build())
                    .build();
        }
    }

    @Getter
    @Builder
    public static class ReviewResp {
        private int idx;
        private String contents;
        private int score;

        public static ReviewResp from(Review review) {
            return ReviewResp.builder()
                    .idx(review.getIdx())
                    .contents(review.getContents())
                    .score(review.getScore())
                    .build();
        }
    }
}
