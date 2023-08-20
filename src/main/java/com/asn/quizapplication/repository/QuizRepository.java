package com.asn.quizapplication.repository;

import com.asn.quizapplication.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends JpaRepository<Question,Integer> {
    List<Question> findByCategory(String category);
}
