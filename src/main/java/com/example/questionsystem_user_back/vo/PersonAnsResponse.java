package com.example.questionsystem_user_back.vo;

import java.util.List;

import com.example.questionsystem_user_back.entity.PersonAnswer;

public class PersonAnsResponse {

	private PersonAnswer personAns;
	
	private List<PersonAnswer> personAnsList;
	
	private String message;
	
	public PersonAnsResponse() {
		
	}
	
	public PersonAnsResponse(String message) {
		this.message = message;
	}

	public PersonAnswer getPersonAns() {
		return personAns;
	}

	public void setPersonAns(PersonAnswer personAns) {
		this.personAns = personAns;
	}

	public List<PersonAnswer> getPersonAnsList() {
		return personAnsList;
	}

	public void setPersonAnsList(List<PersonAnswer> personAnsList) {
		this.personAnsList = personAnsList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
