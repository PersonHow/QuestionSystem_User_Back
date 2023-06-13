package com.example.questionsystem_user_back.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "survey_info")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyInfo {

	@Id
	@Column(name = "survey_id")
	private Integer surveyId;
	
	@Column(name = "survey_title")
	private String surveyTitle;
	
	@Column(name = "survey_content")
	private String surveyContent;
	
	@Column(name = "survey_condition")
	private String surveyCondition;
	
	@Column(name = "survey_starttime")
	private LocalDate surveyStartTime;
	
	@Column(name = "survey_endtime")
	private LocalDate surveyEndTime;
	
	@Column(name = "survey_question")
	private String surveyQuestion;
	
	@Column(name = "survey_answer")
	private String surveyAnswer;

	public SurveyInfo() {
		
	}
	
	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public String getSurveyTitle() {
		return surveyTitle;
	}

	public void setSurveyTitle(String surveyTitle) {
		this.surveyTitle = surveyTitle;
	}

	public String getSurveyContent() {
		return surveyContent;
	}

	public void setSurveyContent(String surveyContent) {
		this.surveyContent = surveyContent;
	}

	public String getSurveyCondition() {
		return surveyCondition;
	}

	public void setSurveyCondition(String surveyCondition) {
		this.surveyCondition = surveyCondition;
	}

	public LocalDate getSurveyStartTime() {
		return surveyStartTime;
	}

	public void setSurveyStartTime(LocalDate surveyStartTime) {
		this.surveyStartTime = surveyStartTime;
	}

	public LocalDate getSurveyEndTime() {
		return surveyEndTime;
	}

	public void setSurveyEndTime(LocalDate surveyEndTime) {
		this.surveyEndTime = surveyEndTime;
	}

	public String getSurveyQuestion() {
		return surveyQuestion;
	}

	public void setSurveyQuestion(String surveyQuestion) {
		this.surveyQuestion = surveyQuestion;
	}

	public String getSurveyAnswer() {
		return surveyAnswer;
	}

	public void setSurveyAnswer(String surveyAnswer) {
		this.surveyAnswer = surveyAnswer;
	}

	
	
	
	
}
