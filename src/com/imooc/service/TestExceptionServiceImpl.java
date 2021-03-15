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
		throw new MyException("service���Զ����쳣");
	}

	@Override
	public void serviceno() throws Exception {
		throw new SQLException("service��δ֪�쳣");
	}

	@Override
	public void servicedb() throws Exception {
		throw new SQLException("sevice�����ݿ��쳣");
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
