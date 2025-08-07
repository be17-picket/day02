package com.sw.spring_study.review.controller;

import com.sw.spring_study.review.model.ReviewDto;
import com.sw.spring_study.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    // 저장
    public ResponseEntity register(@RequestBody ReviewDto.Register register) {
        reviewService.register(register);

        return ResponseEntity.ok().build();
    }
    // 조회
}
