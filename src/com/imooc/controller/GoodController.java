package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imooc.pojo.GoodModel;

@Controller
@RequestMapping("/my")
public class GoodController {
	
	@RequestMapping("/converter")
	public String add(@RequestParam("goods") GoodModel gm, Model model) {
		model.addAttribute("good", gm);
		return "showGood";
	}
}
