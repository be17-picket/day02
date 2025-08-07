package com.sw.spring_study.b.repository;

import com.sw.spring_study.b.model.B;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BRepository extends JpaRepository<B, Integer> {
}
