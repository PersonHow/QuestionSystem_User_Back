package com.example.questionsystem_user_back.vo;

import java.util.List;

import com.example.questionsystem_user_back.entity.SurveyInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyInfoRequest {
	
	@JsonProperty("survey_id")
	private Integer surveyId;
	
	@JsonProperty("surveyInfo")
	private SurveyInfo surveyInfo;
	
	@JsonProperty("surveyInfoList")
	private List<SurveyInfo> surveyInfoList;
	
	public SurveyInfoRequest() {
		
	}

	public SurveyInfo getSurveyInfo() {
		return surveyInfo;
	}

	public void setSurveyInfo(SurveyInfo surveyInfo) {
		this.surveyInfo = surveyInfo;
	}

	public List<SurveyInfo> getSurveyInfoList() {
		return surveyInfoList;
	}

	public void setSurveyInfoList(List<SurveyInfo> surveyInfoList) {
		this.surveyInfoList = surveyInfoList;
	}

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}
	
	
}
