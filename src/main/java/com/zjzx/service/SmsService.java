package com.zjzx.service;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zjzx.util.SmsDemo;
@Service
public class SmsService   {

	public JSONObject sendCode(String mobile, String code) {
		// TODO Auto-generated method stub
		JSONObject resMap = SmsDemo.sendCode(mobile, code);
		
		return resMap;
	}

}
