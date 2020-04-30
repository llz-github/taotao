package com.taotao.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.manager.service.TestService;

@Controller
@RequestMapping("test")
public class TestController {
	@Autowired
	private TestService Testservice;
	
	@RequestMapping("queryDate")
	@ResponseBody
	public String Testcontroller() {
		String date = this.Testservice.queryDate();
		return date;
	}
}
