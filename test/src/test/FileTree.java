package test;

import java.io.File;

public class FileTree {
	static String a = "-";
	public static void main(String[] args) {
		File file = new File("F:\\迅雷下载");
		digui(file);
	}

	private static void digui(File file) {
		String b = "";
		File[] listFiles = file.listFiles();
		for (File file2 : listFiles) {

			System.out.println(a + file2.getName());
			if (file2.isDirectory()) {
				a = a + "-";
				b = b + "-";
				digui(file2);
			} else {
				a = b;
			}

		}

	}
}
