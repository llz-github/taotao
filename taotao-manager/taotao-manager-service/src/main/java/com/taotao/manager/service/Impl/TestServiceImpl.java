package com.taotao.manager.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.manager.mapper.TestMapper;
import com.taotao.manager.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestMapper Testmapper;

	@Override
	public String queryDate() {
		String date  = this.Testmapper.queryDate();
		return date;
	}
	
	
	
}
