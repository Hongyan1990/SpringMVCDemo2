package com.imooc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imooc.pojo.UserModel;

@Controller
public class MyUserController {
	@RequestMapping("tologin")
	public String toLogin() {
		return "mylogin";
	}
	
	@RequestMapping("mylogin")
	public String myLogin(UserModel user, Model model, HttpSession session) {
		if("zhangsan".equals(user.getName()) && "123".equals(user.getPwd())) {
			session.setAttribute("user", user);
			return "redirect:main";
		}
		model.addAttribute("msg", "用户名或密码错误，请重新登录！ ");
		return "mylogin";
	}
	
	@RequestMapping("main")
	public String main() {
		return "main";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "mylogin";
	}
}
