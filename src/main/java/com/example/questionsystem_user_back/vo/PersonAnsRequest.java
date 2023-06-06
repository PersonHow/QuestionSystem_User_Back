package com.example.questionsystem_user_back.vo;

import java.util.List;

import com.example.questionsystem_user_back.entity.PersonAnswer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonAnsRequest {
	
	@JsonProperty("survey_id")
	private Integer surveyId;
	
	@JsonProperty("user_email")
	private String email;
	
	@JsonProperty("personAns")
	private PersonAnswer personAnswer;
	
	@JsonProperty("personAnsList")
	private List<PersonAnswer> personAnsList;
	
	public PersonAnsRequest() {
		
	}

	public PersonAnswer getPersonAnswer() {
		return personAnswer;
	}

	public void setPersonAnswer(PersonAnswer personAnswer) {
		this.personAnswer = personAnswer;
	}

	public List<PersonAnswer> getPersonAnsList() {
		return personAnsList;
	}

	public void setPersonAnsList(List<PersonAnswer> personAnsList) {
		this.personAnsList = personAnsList;
	}

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
