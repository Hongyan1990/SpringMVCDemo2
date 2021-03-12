package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imooc.pojo.GoodModel;

@Controller
public class FormatterController {
	@RequestMapping("formatter")
	public String add(GoodModel gm, Model model) {
		model.addAttribute("good", gm);
		return "showGood";
	}
}
