package com.sw.spring_study.a.repository;

import com.sw.spring_study.a.model.A;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ARepository extends JpaRepository<A, Integer> {
    List<A> findByA01(String a01);
}
