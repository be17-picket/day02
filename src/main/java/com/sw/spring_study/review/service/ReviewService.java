package com.sw.spring_study.review.service;

import com.sw.spring_study.review.model.ReviewDto;
import com.sw.spring_study.review.repository.ReviewRepository;
import com.sw.spring_study.book.repository.BookRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    // 저장
    public void register(ReviewDto.Register register) {
        reviewRepository.save(register.toEntity());
    }

    // 조회
}
