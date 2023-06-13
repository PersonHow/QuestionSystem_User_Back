package com.example.questionsystem_user_back.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.questionsystem_user_back.entity.SurveyInfo;
import com.example.questionsystem_user_back.repository.SurveyInfoDao;
import com.example.questionsystem_user_back.service.ifs.SurveyInfoService;
import com.example.questionsystem_user_back.vo.SurveyInfoRequest;
import com.example.questionsystem_user_back.vo.SurveyInfoResponse;

@Service
public class SurveyInfoServiceImpl implements SurveyInfoService {

	@Autowired
	private SurveyInfoDao surveyInfoDao;

	public SurveyInfoResponse addSurvey(SurveyInfoRequest surveyInfoRequest) {
		SurveyInfo addSur = surveyInfoRequest.getSurveyInfo();
		if (!StringUtils.hasText(addSur.getSurveyTitle())) {
			return new SurveyInfoResponse("缺乏標題");
		}
		if (!addSur.getSurveyStartTime().isBefore(addSur.getSurveyEndTime())) {
			return new SurveyInfoResponse("時間設定有問題");
		}

		List<SurveyInfo> allData = surveyInfoDao.findAll();

		// 測試用，實際由前端加入
		addSur.setSurveyId(allData.size() + 1);

		addSur.setSurveyCondition("未開放");
		surveyInfoDao.save(addSur);
		return new SurveyInfoResponse(addSur, "新增成功");
	}

//=======================================================================

	public List<SurveyInfo> allSurvey(SurveyInfoRequest surveyInfoRequest) {
		Integer id = surveyInfoRequest.getSurveyId();
		if (id == 0) {
			List<SurveyInfo> allList = surveyInfoDao.findAll();
			return allList;
		}
		return null;
	}

//========================================================================
	public SurveyInfoResponse getSurvey(SurveyInfoRequest surveyInfoRequest) {
		Integer id = surveyInfoRequest.getSurveyId();
		if (!StringUtils.hasText(id.toString())) {
			return new SurveyInfoResponse("不要輸入空資料");
		}
		Optional<SurveyInfo> target = surveyInfoDao.findById(id);
		SurveyInfo tarGet = target.get();
		
		return new SurveyInfoResponse(tarGet,"有抓到資料");
	}
}
