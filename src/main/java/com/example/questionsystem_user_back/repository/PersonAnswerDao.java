package com.example.questionsystem_user_back.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.questionsystem_user_back.entity.PersonAnsKeys;
import com.example.questionsystem_user_back.entity.PersonAnswer;
import com.example.questionsystem_user_back.entity.SurveyAnswer;

public interface PersonAnswerDao extends JpaRepository<PersonAnswer, PersonAnsKeys>{

	@Transactional
	@Modifying
	@Query("select e from PersonAnswer e where e.survey_id = :survey_id and e.user_email = :user_email")
	public PersonAnswer findByPrimaryKey(@Param("survey_id") Integer survey_id,
			@Param("user_email") String user_eamil);
}
