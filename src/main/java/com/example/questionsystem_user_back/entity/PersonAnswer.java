package com.example.questionsystem_user_back.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "person_answer")
@IdClass(PersonAnsKeys.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonAnswer {

	// 訂單編碼
		@Id
		@Column(name = "survey_id")
		private Integer surveyId;
		
		@Id
		@Column(name = "user_email")
		private String userEmail;
		
		@Column(name = "user1_ans")
		private String user1Ans;
		
		@Column(name = "user2_ans")
		private String user2Ans;
		
		@Column(name = "user3_ans")
		private String user3Ans;
		
		@Column(name = "user4_ans")
		private String user4Ans;
		
		@Column(name = "user5_ans")
		private String user5Ans;
		
		@Column(name = "time")
		private LocalDateTime time;
		
		
		public PersonAnswer() {
			
		}

		public Integer getSurveyId() {
			return surveyId;
		}

		public void setSurveyId(Integer surveyId) {
			this.surveyId = surveyId;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public String getUser1Ans() {
			return user1Ans;
		}

		public void setUser1Ans(String user1Ans) {
			this.user1Ans = user1Ans;
		}

		public String getUser2Ans() {
			return user2Ans;
		}

		public void setUser2Ans(String user2Ans) {
			this.user2Ans = user2Ans;
		}

		public String getUser3Ans() {
			return user3Ans;
		}

		public void setUser3Ans(String user3Ans) {
			this.user3Ans = user3Ans;
		}

		public String getUser4Ans() {
			return user4Ans;
		}

		public void setUser4Ans(String user4Ans) {
			this.user4Ans = user4Ans;
		}

		public String getUser5Ans() {
			return user5Ans;
		}

		public void setUser5Ans(String user5Ans) {
			this.user5Ans = user5Ans;
		}

		public LocalDateTime getTime() {
			return time;
		}

		public void setTime(LocalDateTime time) {
			this.time = time;
		}

		
		
}
