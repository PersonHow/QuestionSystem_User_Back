package com.example.questionsystem_user_back.repository;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.questionsystem_user_back.entity.PersonAnsKeys;
import com.example.questionsystem_user_back.entity.PersonAnswer;


public interface PersonAnswerDao extends JpaRepository<PersonAnswer, PersonAnsKeys>{

}
