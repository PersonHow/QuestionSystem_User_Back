package com.example.questionsystem_user_back.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "person_info")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonInfo {

	// 訂單編碼
	@Id
	@Column(name = "email")
	private String email;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "phone")
	private Integer phone;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "survey_num")
	private String surveyNum;

	public PersonInfo() {
		
	}
	
	public PersonInfo(String email, String name,  Integer phone,Integer age, String surveyNum) {
		this.email = email;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.surveyNum = surveyNum;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getSurveyNum() {
		return surveyNum;
	}

	public void setSurveyNum(String surveyNum) {
		this.surveyNum = surveyNum;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
}
