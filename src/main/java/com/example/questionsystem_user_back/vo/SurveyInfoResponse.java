package com.example.questionsystem_user_back.vo;

import java.util.List;

import com.example.questionsystem_user_back.entity.SurveyInfo;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyInfoResponse {

	private SurveyInfo surveyInfo;
	
	private List<SurveyInfo> sruveyInfoList;
	
	private String message;
	
	public SurveyInfoResponse() {
		
	}
	
	public SurveyInfoResponse(SurveyInfo surveyInfo,String message) {
		this.surveyInfo = surveyInfo;
		this.message = message;
	}
	
	public SurveyInfoResponse(String message) {
		this.message = message;
	}

	public SurveyInfo getSurveyInfo() {
		return surveyInfo;
	}

	public void setSurveyInfo(SurveyInfo surveyInfo) {
		this.surveyInfo = surveyInfo;
	}

	public List<SurveyInfo> getSruveyInfoList() {
		return sruveyInfoList;
	}

	public void setSruveyInfoList(List<SurveyInfo> sruveyInfoList) {
		this.sruveyInfoList = sruveyInfoList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
