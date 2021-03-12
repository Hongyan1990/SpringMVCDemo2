package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imooc.pojo.Person;

@Controller
public class TestController {
	@RequestMapping("testJson")
	@ResponseBody
	public Person testJson(@RequestBody Person user) {
		System.out.println("name: " + user.getName() + ", age: " + user.getAge() + ", sex: " + user.getSex());
		return user;
	}
}
