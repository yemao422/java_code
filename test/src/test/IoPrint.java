/*
 * Copyright (C) 2017 ShenZhen LiXiang Software Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳市理想软件有限公司
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Io打印流
 * 
 * @version 2019年6月13日上午11:03:03
 * @author GuoShuisheng
 */
public class IoPrint {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Administrator\\Desktop\\io练习.txt");
		PrintWriter printWriter = new PrintWriter(System.out);
		printWriter.write("xx");
		printWriter.flush();
	}
}
