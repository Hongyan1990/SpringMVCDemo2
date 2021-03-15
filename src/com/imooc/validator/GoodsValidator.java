package com.imooc.validator;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.imooc.pojo.GoodModel;

@Component
public class GoodsValidator implements Validator {

	@Override
	public boolean supports(Class<?> klass) {
		return GoodModel.class.isAssignableFrom(klass);
	}

	@Override
	public void validate(Object obj, Errors err) {
		GoodModel goods = (GoodModel) obj;
		ValidationUtils.rejectIfEmpty(err, "goodName", "goods.gname.required");
		if(goods.getGoodPrice() > 100 || goods.getGoodPrice() < 0) {
			err.rejectValue("goodPrice", "gprice.invalid");
		}
		Date date = goods.getDate();
		if(date != null && date.after(new Date())) {
			err.rejectValue("date", "gdate.invalid");
		}
	}

}
