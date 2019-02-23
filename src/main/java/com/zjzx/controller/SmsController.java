package com.zjzx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.zjzx.service.SmsService;

@RestController
@RequestMapping("sms")
public class SmsController {
	@Autowired
	private SmsService smsService;
	
	@RequestMapping("sendCode")
	public JSONObject sendCode(String mobile, String code) {
		return smsService.sendCode(mobile, code);
	}
}
