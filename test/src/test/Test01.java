/*
 * Copyright (C) 2017 ShenZhen LiXiang Software Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳市理想软件有限公司
 */
package test;

import java.util.Calendar;
import java.util.Date;

/**
 * TODO:类功能介绍
 * @version 2019年6月4日上午9:33:13
 * @author GuoShuisheng
 */
public class Test01 {



	public static void main(String[] args) {
		// Fruit[] values = Fruit.values();
		// for (Fruit s : values) {
		// System.out.println(s);
		// }
		// System.out.println(Fruit.A.getA());

		// Calendar calendar = Calendar.getInstance();
		// // 获取年
		// int year = calendar.get(Calendar.YEAR);
		// // 获取月，这里需要需要月份的范围为0~11，因此获取月份的时候需要+1才是当前月份值
		// int month = calendar.get(Calendar.MONTH) + 1;
		// // 获取日
		// int day = calendar.get(Calendar.DAY_OF_MONTH);
		//
		// // 获取时
		// int hour = calendar.get(Calendar.HOUR);
		// // int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24小时表示
		//
		// // 获取分
		// int minute = calendar.get(Calendar.MINUTE);
		//
		// // 获取秒
		// int second = calendar.get(Calendar.SECOND);
		//
		// // 星期，英语国家星期从星期日开始计算
		// int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		//
		// System.out.println("现在是" + year + "年" + month + "月" + day + "日" +
		// hour + "时" + minute + "分" + second + "秒"
		// + "星期" + weekday);

		// System.out.printf("", "");
		LiuDeHuaProxy proxy = new LiuDeHuaProxy();
		// 获得代理对象
		Person p = proxy.getProxy();
		// 调用代理对象的sing方法
		String retValue = p.sing("冰雨");
		System.out.println(retValue);
		// 调用代理对象的dance方法
		String value = p.dance("江南style");
		System.out.println(value);
	}

}
