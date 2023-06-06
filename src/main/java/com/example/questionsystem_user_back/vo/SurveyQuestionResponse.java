package com.example.questionsystem_user_back.vo;

import java.util.List;

import com.example.questionsystem_user_back.entity.SurveyQuestion;

public class SurveyQuestionResponse {

	private SurveyQuestion surveyQuestion;
	
	private List<SurveyQuestion> surveyQuestionList;
	
	private String message;
	
	public SurveyQuestionResponse() {
		
	}
	
	public SurveyQuestionResponse(String message) {
		this.message = message;
	}

	public SurveyQuestion getSurveyQuestion() {
		return surveyQuestion;
	}

	public void setSurveyQuestion(SurveyQuestion surveyQuestion) {
		this.surveyQuestion = surveyQuestion;
	}

	public List<SurveyQuestion> getSurveyQuestionList() {
		return surveyQuestionList;
	}

	public void setSurveyQuestionList(List<SurveyQuestion> surveyQuestionList) {
		this.surveyQuestionList = surveyQuestionList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
