package test;

import java.io.File;

/**
 * 递归遍历指定目录下的文件和目录
 * 
 * 递归的运用？思维方式
 */
public class ForEachFile {

	public static void main(String[] args) {
		File destFile = new File("F:\\迅雷下载");
		forEach(destFile, 0, "-");
	}

	/**
	 * 
	 * 递归遍历指定目录下的文件和目录
	 * 
	 * @version 2019年5月20日下午2:29:50
	 * @author zhuwenbin
	 * @param destFile
	 */
	private static void forEach(File destFile, int level, String prefix) {
		// 判断输入的路径是否为null或者是一个文件
		if (destFile == null || destFile.isFile()) {
			return;
		}
		// 列出当前目录里面的内容，包括文件和目录
		File[] listFiles = destFile.listFiles();
		for (File file : listFiles) {
			// 根据层级拼接前缀
			StringBuffer sb = new StringBuffer(prefix);
			for (int i = 0; i < level; i++) {
				sb.append(prefix);
			}
			sb.append(file.getName());
			System.out.println(sb.toString());
			// 判断file是目录还是文件，如果是目录继续遍历
			if (file.isDirectory()) {
				// 如果是个隐藏的目录则略过
				if (file.isHidden()) {
					continue;
				}
				// 递归
				forEach(file, level + 1, prefix);
			}
		}

	}
}
