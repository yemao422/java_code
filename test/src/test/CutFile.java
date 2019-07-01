package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CutFile {
	// 1 kb=1000 byte
	// 1 mb=1000*1000 byte
	// 1 gb=1000*1000*1000
	// private static final byte LONG = (byte) (1000 * 1000 * 1000);
	public static void main(String[] args) {
		String firstPath = "D:\\test\\09-分页的操作.mp4";
		String lastpath = "D:\\test\\09-分页的操作";
		cutFile(firstPath, lastpath);
		System.out.println("ok");

	}

	private static void cutFile(String firstPath, String lastpath) {
		File firstFile = new File(firstPath);
		int x = 0;
		String substring = firstPath.substring(firstPath.length() - 4, firstPath.length());
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(firstFile));

			int len = 0;
			byte[] b = new byte[10 * 1024 * 1024];// 10MB

			while ((len = bis.read(b)) != -1) {
				x = x + 1;
				String y = lastpath + x + substring;
				File lastFile = new File(y);
				BufferedOutputStream bos = null;
				bos = new BufferedOutputStream(new FileOutputStream(lastFile));
				bos.write(b, 0, len);
				bos.flush();
				bos.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
