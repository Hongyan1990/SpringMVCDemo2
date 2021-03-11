package com.imooc.converter;

import org.springframework.core.convert.converter.Converter;

import com.imooc.pojo.GoodModel;

public class GoodsConverter implements Converter<String, GoodModel> {

	@Override
	public GoodModel convert(String source) {
		GoodModel good = new GoodModel();
		String vals[] = source.split(",");
		if(vals != null && vals.length == 3) {
			good.setGoodName(vals[0]);
			good.setGoodPrice(Double.parseDouble(vals[1]));
			good.setGoodNum(Integer.parseInt(vals[2]));
			return good;
		} else {
			throw new IllegalArgumentException(String.format("类型转换失败，需要格式是'apple, 10.55, 5', 但格式是[%s]", source));
		}
		
	}

}
