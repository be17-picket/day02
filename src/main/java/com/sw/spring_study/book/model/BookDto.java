package com.sw.spring_study.book.model;

import lombok.Builder;
import lombok.Getter;

public class BookDto {

    @Getter
    public static class Register {
        private String title;
        private Integer pages;
        private Integer price;

        public Book toEntity() {
            return Book.builder()
                    .title(title)
                    .pages(pages)
                    .price(price)
                    .build();
        }
    }

    @Getter
    @Builder
    public static class Response {
        private Integer idx;
        private String title;
        private Integer pages;
        private Integer price;

        public static Response from(Book entity) {
            return Response.builder()
                    .idx(entity.getIdx())
                    .title(entity.getTitle())
                    .pages(entity.getPages())
                    .price(entity.getPrice())
                    .build();
        }
    }
}
