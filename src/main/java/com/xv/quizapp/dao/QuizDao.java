package com.xv.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xv.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{
    
}
