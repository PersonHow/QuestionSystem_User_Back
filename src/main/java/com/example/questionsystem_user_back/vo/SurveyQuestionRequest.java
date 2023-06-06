package com.example.questionsystem_user_back.vo;

import java.util.List;

import com.example.questionsystem_user_back.entity.SurveyQuestion;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyQuestionRequest {
	
	@JsonProperty("survey_id")
	private Integer surveyId;

	@JsonProperty("surveyQuestion")
	private SurveyQuestion surveyQuestion;
	
	@JsonProperty("surveyQuestionList")
	private List<SurveyQuestion> surveyQuestionList;
	
	public SurveyQuestionRequest() {
		
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

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}
	
	
}
