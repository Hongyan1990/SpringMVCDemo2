package com.imooc.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.imooc.pojo.GoodModel;

@Service
public class GoodsServiceImpl implements GoodsService {
	private static ArrayList<GoodModel> goods = new ArrayList<GoodModel>();
	@Override
	public boolean save(GoodModel good) {
		this.goods.add(good);
		return true;
	}

	@Override
	public ArrayList<GoodModel> getGoods() {
		return goods;
	}

}
