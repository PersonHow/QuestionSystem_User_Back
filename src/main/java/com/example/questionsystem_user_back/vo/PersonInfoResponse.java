package com.example.questionsystem_user_back.vo;

import java.util.List;

import com.example.questionsystem_user_back.entity.PersonInfo;

public class PersonInfoResponse {

	private PersonInfo personInfo;
	
	private List<PersonInfo> personInfoList;
	
	private String message;
	
	public PersonInfoResponse() {
		
	}
	
	public PersonInfoResponse(String message) {
		this.message = message;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	public List<PersonInfo> getPersonInfoList() {
		return personInfoList;
	}

	public void setPersonInfoList(List<PersonInfo> personInfoList) {
		this.personInfoList = personInfoList;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
