package com.example.questionsystem_user_back.vo;

import java.util.List;

import com.example.questionsystem_user_back.entity.SurveyAnswer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyAnsRequest {
	
	@JsonProperty("survey_id")
	private Integer surveyId;
	
	@JsonProperty("surveyAnswer")
	private SurveyAnswer surveyAnswer;
	
	@JsonProperty("surveyAnsList")
	private List<SurveyAnswer> surveyAnsList;
	
	public SurveyAnsRequest() {
		
	}

	public SurveyAnswer getSurveyAnswer() {
		return surveyAnswer;
	}

	public void setSurveyAnswer(SurveyAnswer surveyAnswer) {
		this.surveyAnswer = surveyAnswer;
	}

	public List<SurveyAnswer> getSurveyAnsList() {
		return surveyAnsList;
	}

	public void setSurveyAnsList(List<SurveyAnswer> surveyAnsList) {
		this.surveyAnsList = surveyAnsList;
	}

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}
	
	
}
