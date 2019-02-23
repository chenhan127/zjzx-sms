package com.zjzx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
@RestController
@RequestMapping("test")
public class TestController {
	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping("test")
	public JSONObject test() {
		String str = null;
		str.length();
		JSONObject resMap = restTemplate.getForObject("http://zjzx-sidecar/article/recommendArticle", JSONObject.class);
		return resMap;
	}

}
