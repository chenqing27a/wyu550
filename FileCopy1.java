package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy1 {

	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("myfile.txt");
			FileOutputStream fos = new FileOutputStream("myfile_cp.txt");
			byte[] buf = new byte[1024];
			int len = 0;// 每次读入字节内容
			// 当读入文件末尾时，读入数据的值为-1，每次读入一个字节，存放变量len中，直到读完整个文件
			while ((len = fis.read(buf)) != -1) {
				fos.write(buf, 0, len);// 将字节写入输出流中，实现copy功能
			}
			if (fos != null) {
				fos.close();
			}
			if (fis != null) {
				fis.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
