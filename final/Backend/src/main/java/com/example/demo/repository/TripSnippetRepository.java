package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entity.TripSnippet;
import java.util.List;

@Repository
public interface TripSnippetRepository extends JpaRepository<TripSnippet, Integer> {
    // 특정 plan_id에 해당하는 모든 스니펫 조회
    List<TripSnippet> findByPlanId(Integer planId);
}