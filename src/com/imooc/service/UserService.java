package com.imooc.service;

import com.imooc.pojo.UserForm;

public interface UserService {
	boolean login(UserForm user);
	boolean register(UserForm user);
}
