package com.example.questionsystem_user_back.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "survey_answer")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyAnswer {

	@Id
	@Column(name = "survey_id")
	private Integer surveyId;

	@Column(name = "question1_ans")
	private String question1Ans;

	@Column(name = "question2_ans")
	private String question2Ans;

	@Column(name = "question3_ans")
	private String question3Ans;

	@Column(name = "question4_ans")
	private String question4Ans;

	@Column(name = "question5_ans")
	private String question5Ans;

	public SurveyAnswer() {

	}

	public Integer getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}

	public String getQuestion1Ans() {
		return question1Ans;
	}

	public void setQuestion1Ans(String question1Ans) {
		this.question1Ans = question1Ans;
	}

	public String getQuestion2Ans() {
		return question2Ans;
	}

	public void setQuestion2Ans(String question2Ans) {
		this.question2Ans = question2Ans;
	}

	public String getQuestion3Ans() {
		return question3Ans;
	}

	public void setQuestion3Ans(String question3Ans) {
		this.question3Ans = question3Ans;
	}

	public String getQuestion4Ans() {
		return question4Ans;
	}

	public void setQuestion4Ans(String question4Ans) {
		this.question4Ans = question4Ans;
	}

	public String getQuestion5Ans() {
		return question5Ans;
	}

	public void setQuestion5Ans(String question5Ans) {
		this.question5Ans = question5Ans;
	}

}
