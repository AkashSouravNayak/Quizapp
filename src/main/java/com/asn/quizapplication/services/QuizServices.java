package com.asn.quizapplication.services;

import com.asn.quizapplication.model.Question;
import com.asn.quizapplication.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServices {

    @Autowired
    QuizRepository quizRepository;

    public List<Question> getAllQuiz(){
        return quizRepository.findAll();
    }

    public List<Question> getCategory(String category) {
        return quizRepository.findByCategory(category);
    }
}
