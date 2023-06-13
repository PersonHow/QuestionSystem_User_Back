package com.example.questionsystem_user_back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.questionsystem_user_back.entity.SurveyInfo;
import com.example.questionsystem_user_back.service.ifs.SurveyInfoService;
import com.example.questionsystem_user_back.vo.SurveyInfoRequest;
import com.example.questionsystem_user_back.vo.SurveyInfoResponse;

@CrossOrigin
@RestController
public class SurveyInfoController {

	@Autowired
	private SurveyInfoService surveyInfoService;
	
	@RequestMapping(value = "add_Survey", method = RequestMethod.POST)
	public SurveyInfoResponse addSurvey(@RequestBody SurveyInfoRequest surveyInfoRequest) {
		return surveyInfoService.addSurvey(surveyInfoRequest);
	}
	
	@RequestMapping(value = "all_Survey", method = RequestMethod.POST)
	public List<SurveyInfo> allSurvey(@RequestBody SurveyInfoRequest surveyInfoRequest) {
		return surveyInfoService.allSurvey(surveyInfoRequest);
	}
	
	@RequestMapping(value = "get_Survey", method = RequestMethod.POST)
	public SurveyInfoResponse getSurvey(@RequestBody SurveyInfoRequest surveyInfoRequest){
		return surveyInfoService.getSurvey(surveyInfoRequest);
	}
}
