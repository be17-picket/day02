package com.sw.spring_study.review.service;

import com.sw.spring_study.review.model.Review;
import com.sw.spring_study.review.model.ReviewDto;
import com.sw.spring_study.review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    // 저장
    public void register(ReviewDto.Register register) {
        reviewRepository.save(register.toEntity());
    }

    public ReviewDto.ReviewResp read(Integer id) {
        Optional<Review> findReview = reviewRepository.findById(id);

        if (findReview.isPresent()) {
            Review entity = findReview.get();

            return ReviewDto.ReviewResp.from(entity);
        }

        return null;
    }

    public List<ReviewDto.ReviewResp> findAll() {
        List<Review> findAll = reviewRepository.findAll();

        return findAll.stream().map(ReviewDto.ReviewResp::from).toList();
    }

    // 조회
}
