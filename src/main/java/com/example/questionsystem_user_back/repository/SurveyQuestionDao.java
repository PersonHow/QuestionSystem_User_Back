package com.example.questionsystem_user_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.questionsystem_user_back.entity.SurveyQuestion;

@Repository
public interface SurveyQuestionDao extends JpaRepository<SurveyQuestion, Integer>{

}
