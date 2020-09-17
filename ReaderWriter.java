package test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\27" + File.separator + "CQ.txt");
		Reader input = new FileReader(f);
		char[] c = new char[1024];
		int len = input.read(c);
		input.close();
		System.out.println(new String(c, 0, len));
		Writer out = new FileWriter(f, true);
		String str = "\r\nHello ×Ö·ûÁ÷";
		out.write(str);
		out.close();
	}

}
