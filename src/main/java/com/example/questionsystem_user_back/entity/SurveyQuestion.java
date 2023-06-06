package com.example.questionsystem_user_back.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "survey_question")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyQuestion {

	@Id
	@Column(name = "survey_id")
	private Integer surveyId;
	
	@Column(name = "question1")
	private String question1;
	
	@Column(name = "question2")
	private String question2;
	
	@Column(name = "question3")
	private String question3;
	
	@Column(name = "question4")
	private String question4;
	
	@Column(name = "question5")
	private String question5;

	
	public SurveyQuestion() {
		
	}
	
	
	
	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public String getQuestion1() {
		return question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}

	public String getQuestion2() {
		return question2;
	}

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}

	public String getQuestion3() {
		return question3;
	}

	public void setQuestion3(String question3) {
		this.question3 = question3;
	}

	public String getQuestion4() {
		return question4;
	}

	public void setQuestion4(String question4) {
		this.question4 = question4;
	}

	public String getQuestion5() {
		return question5;
	}

	public void setQuestion5(String question5) {
		this.question5 = question5;
	}
	
	
	
	
}
