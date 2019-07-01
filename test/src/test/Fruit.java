/*
 * Copyright (C) 2017 ShenZhen LiXiang Software Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳市理想软件有限公司
 */
package test;

/**
 * TODO:类功能介绍
 * @version 2019年6月4日下午6:52:05
 * @author GuoShuisheng
 */
public enum Fruit {
	A("1"), B("1"), C("1");
	private final String a;

	private Fruit(String a) {
		this.a = a;
	}

	public String getA() {
		return a;
	}
}
