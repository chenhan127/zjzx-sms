package com.zjzx.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@ControllerAdvice
@ResponseBody
public class ExceptionReslover {
	@Autowired
	private HttpServletRequest request;
	@ExceptionHandler
	public JSONObject hander(Exception e) {
		JSONObject resMap = new JSONObject();
		Map<String, String[]> paramMap = request.getParameterMap();
		resMap.put("e", printStackTraceToString(e));
		resMap.put("paramMap", paramMap);
		System.out.println(resMap);
		e.printStackTrace();
		return resMap;
	}

	public String printStackTraceToString(Throwable t) {
		StringWriter sw = new StringWriter();
		t.printStackTrace(new PrintWriter(sw, true));
		return sw.getBuffer().toString();
	}

}
