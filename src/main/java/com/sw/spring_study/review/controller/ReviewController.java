package com.sw.spring_study.review.controller;

import com.sw.spring_study.review.model.ReviewDto;
import com.sw.spring_study.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    // 저장
    @PostMapping
    public ResponseEntity register(@RequestBody ReviewDto.Register register) {
        reviewService.register(register);

        return ResponseEntity.ok().build();
    }

    // 조회
    @GetMapping
    public ResponseEntity read(Integer id) {
        ReviewDto.ReviewResp findReview = reviewService.read(id);

        return ResponseEntity.ok().body(findReview);
    }

    // 전체 조회
    @GetMapping("/list")
    public ResponseEntity list() {
        List<ReviewDto.ReviewResp> findReviews = reviewService.findAll();

        return ResponseEntity.ok().body(findReviews);
    }

}
