package com.imooc.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository("TestExceptionDao")
public class TestExceptionDao {
	public void daodb() throws Exception {
		throw new SQLException("Dao�����ݿ��쳣");
	}
	
	public void daomy() throws Exception {
		throw new SQLException("Dao���Զ����쳣");
	}
	
	public void daono() throws Exception {
		throw new SQLException("Dao��δ֪�쳣");
	}
}
