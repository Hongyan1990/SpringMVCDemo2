package com.imooc.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.dao.TestExceptionDao;
import com.imooc.exception.MyException;

@Service("TestExceptionService")
public class TestExceptionServiceImpl implements TestExceptionService {
	
	@Autowired
	public TestExceptionDao testExceptionDao;

	@Override
	public void servicemy() throws Exception {
		throw new MyException("service中自定义异常");
	}

	@Override
	public void serviceno() throws Exception {
		throw new SQLException("service中未知异常");
	}

	@Override
	public void servicedb() throws Exception {
		throw new SQLException("sevice中数据库异常");
	}

	@Override
	public void daodb() throws Exception {
		testExceptionDao.daodb();
	}

	@Override
	public void daomy() throws Exception {
		testExceptionDao.daomy();
	}

	@Override
	public void daono() throws Exception {
		testExceptionDao.daono();
	}

}
