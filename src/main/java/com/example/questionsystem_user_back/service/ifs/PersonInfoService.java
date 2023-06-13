package com.example.questionsystem_user_back.service.ifs;

import com.example.questionsystem_user_back.vo.PersonInfoRequest;
import com.example.questionsystem_user_back.vo.PersonInfoResponse;

public interface PersonInfoService {
	
	public PersonInfoResponse addUser(PersonInfoRequest request);

}
