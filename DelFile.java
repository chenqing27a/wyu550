package test;

import java.io.File;
import java.io.IOException;

public class DelFile {
	public static void delDir(String path) { // 删除文件夹
		File dir = new File(path);
		if (dir.exists()) {
			File[] tmp = dir.listFiles();
			for (int i = 0; i < tmp.length; i++) {
				if (tmp[i].isDirectory()) {
					delDir(tmp[i].getAbsolutePath());// 递归删除
				} else {
					tmp[i].delete();
				}
			}
		}
		boolean bool = dir.delete();
		System.out.println(bool);
	}

	public static void main(String[] args) throws IOException {
		// 删除文件调用
		String fileUrl = "C:\\27";
		delDir(fileUrl);
	}

}
