package com.imooc.service;

import java.util.ArrayList;

import com.imooc.pojo.GoodModel;

public interface GoodsService {
	public boolean save(GoodModel good);
	public ArrayList<GoodModel> getGoods();
}
