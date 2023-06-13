package com.example.questionsystem_user_back.service.ifs;

import java.util.List;

import com.example.questionsystem_user_back.entity.SurveyInfo;
import com.example.questionsystem_user_back.vo.SurveyInfoRequest;
import com.example.questionsystem_user_back.vo.SurveyInfoResponse;

public interface SurveyInfoService {

	public SurveyInfoResponse addSurvey(SurveyInfoRequest surveyInfoRequest);
	
	public List<SurveyInfo> allSurvey(SurveyInfoRequest surveyInfoRequest);
	
	public SurveyInfoResponse getSurvey(SurveyInfoRequest surveyInfoRequest);
}
	