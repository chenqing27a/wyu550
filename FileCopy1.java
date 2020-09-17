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
			int len = 0;// ÿ�ζ����ֽ�����
			// �������ļ�ĩβʱ���������ݵ�ֵΪ-1��ÿ�ζ���һ���ֽڣ���ű���len�У�ֱ�����������ļ�
			while ((len = fis.read(buf)) != -1) {
				fos.write(buf, 0, len);// ���ֽ�д��������У�ʵ��copy����
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
