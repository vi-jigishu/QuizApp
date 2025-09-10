package com.xv.quizapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xv.quizapp.Question;
import com.xv.quizapp.dao.QuestionDao;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
        // return null;
        
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }


    
    public String addQuestion(Question question) {
        questionDao.save(question);
        return "success";
    }


    public String deleteQuestion(Integer id) {
        questionDao.deleteById(id);
        return "deleted";

    }

    public String updateQuestion(Integer id, Question question) {
        question.setId(id);
        questionDao.save(question);
        return "updated";
    }

    
    

}
