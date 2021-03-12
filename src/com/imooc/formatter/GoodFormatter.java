package com.imooc.formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class GoodFormatter implements Formatter<Date> {
	SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd");
	@Override
	public String print(Date arg0, Locale arg1) {
		// TODO Auto-generated method stub
		return dateFormate.format(arg0);
	}

	@Override
	public Date parse(String arg0, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return dateFormate.parse(arg0);
	}

}
