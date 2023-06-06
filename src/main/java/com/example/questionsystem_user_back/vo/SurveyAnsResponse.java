package com.example.questionsystem_user_back.vo;

import java.util.List;

import com.example.questionsystem_user_back.entity.SurveyAnswer;

public class SurveyAnsResponse {

	private SurveyAnswer surveyAns;
	
	private List<SurveyAnswer> surveyAnsList;
	
	private String message;
	
	public SurveyAnsResponse() {
		
	}
	
	public SurveyAnsResponse(String message) {
		this.message = message;
	}

	public SurveyAnswer getSurveyAns() {
		return surveyAns;
	}

	public void setSurveyAns(SurveyAnswer surveyAns) {
		this.surveyAns = surveyAns;
	}

	public List<SurveyAnswer> getSurveyAnsList() {
		return surveyAnsList;
	}

	public void setSurveyAnsList(List<SurveyAnswer> surveyAnsList) {
		this.surveyAnsList = surveyAnsList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
