package com.imooc.controller;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imooc.pojo.GoodModel;
import com.imooc.service.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodController {
	private static final Log logger = LogFactory.getLog(GoodController.class);
	@Autowired
	public GoodsService goodsService;
	
	@Resource
	private Validator validator;
	
	@RequestMapping("/input")
	public String input(Model model) {
		model.addAttribute("goods", new GoodModel());
		return "addgood";
	}
	
	@RequestMapping("/save")
	public String saveGood(@ModelAttribute GoodModel good, BindingResult result, Model model) {
		this.validator.validate(good, result);
		if(result.hasErrors()) {
			return "addgood";
		}
		goodsService.save(good);
		logger.info("商品添加成功");
		model.addAttribute("goodList", goodsService.getGoods());
		return "showGood";
	}
}
