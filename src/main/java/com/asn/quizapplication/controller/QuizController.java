package com.asn.quizapplication.controller;

import com.asn.quizapplication.model.Question;
import com.asn.quizapplication.services.QuizServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizServices quizServices;
    @GetMapping(value = "all")
    public List<Question> getAllQuiz(){
        return quizServices.getAllQuiz();
    }

    @GetMapping(value = "/category/{ctrname}")
    public List<Question> getQuestionForCategory(@PathVariable("ctrname") String category){
        return quizServices.getCategory(category);
    }

}
