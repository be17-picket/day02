package com.sw.spring_study.review.repository;

import com.sw.spring_study.review.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
