package com.imooc.controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imooc.pojo.UserForm;
import com.imooc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private static final Log logger = LogFactory.getLog(UserController.class);
	
//	@Autowired
//	public UserService userService;
	
	@RequestMapping("/login")
	public String login(@ModelAttribute("user") UserForm user) {
//		if(userService.login(user)) {
//			logger.info("�ɹ�");
//			return "main";
//		} else {
//			logger.info("ʧ��");
//			return "login";
//		}
		return "main";
	}
	
	@RequestMapping("/register")
	public String register(UserForm user, HttpSession session, Model model) {
//		if(userService.login(user)) {
//			logger.info("�ɹ�");
//			return "login";
//		} else {
//			logger.info("ʧ��");
//			model.addAttribute("uname", user.getUname());
//			return "register";
//		}
		return "register";
	}
}
