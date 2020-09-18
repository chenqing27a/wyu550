package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.UUID;

public class CopyFile2 {
	public static void main(String[] args) throws Exception {
		// �ı��ļ��Ŀ���
		File txtFile = new File("D:/myfile.txt");
		File destFile = new File("D:/myfile_cp2.txt");
		Reader in = new FileReader(txtFile);
		char[] chars = new char[(int) txtFile.length()];
		in.read(chars);
		Writer out = new FileWriter(destFile);
		out.write(chars);
		in.close();
		out.close();
		// ͼƬ�ļ��Ŀ���
		File srcFile = new File("D:/1.jpg");
		String srcFileName = srcFile.getName();
		// �µ��ļ���
		String newName = UUID.randomUUID().toString();
		// ָ��Ŀ���ļ�
		File muFile = new File("D:/" + newName + "." + srcFileName);
		// ����һ���ֽ����飬��СΪԴ�ļ����ȣ�����ת��int
		byte[] a = new byte[(int) srcFile.length()];
		// �����ֽ�������
		InputStream fis = new FileInputStream(srcFile);
		// ��Դ�ļ������ֽ�����
		fis.read(a);
		// �����ֽ������
		OutputStream fos = new FileOutputStream(muFile);
		// ���ֽ�����д��Ŀ���ļ�
		fos.write(a);
		fis.close();
		fos.close();
	}
}
