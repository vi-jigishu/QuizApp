package com.xv.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xv.quizapp.Question;
import java.util.List;



@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    
    List<Question> findByCategory(String category);
}
