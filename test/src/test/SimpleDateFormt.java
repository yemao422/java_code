/*
 * Copyright (C) 2017 ShenZhen LiXiang Software Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳市理想软件有限公司
 */
package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TODO:类功能介绍
 * @version 2019年6月5日上午9:09:36
 * @author GuoShuisheng
 */
public class SimpleDateFormt {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date parse = null;
		try {
			parse = dateFormat.parse("2010-02-01 22:59:59");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(dateFormat.format(date));
		System.out.println(dateFormat.format(parse));
	}
}
