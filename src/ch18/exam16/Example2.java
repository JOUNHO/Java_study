package ch18.exam16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Example2 {

	public static void main(String[] args) throws Exception {
//		String filePath="F:\\Java_study\\Java_study\\src\\ch18\\exam16\\data.txt";
//		OutputStream os=new FileOutputStream(filePath);
//		
//		String data="������ �������̴�.";
//		byte[] bytes=data.getBytes("UTF-8");
//		os.write(bytes);
//		
//		data="������ �����ؿ�.";
//		bytes=data.getBytes("UTF-8");
//		os.write(bytes);
//		
//		os.flush();
//		os.close();
		
		String filePath="F:\\Java_study\\Java_study\\src\\ch18\\exam16\\data.txt";
		OutputStream os=new FileOutputStream(filePath);
		Writer writer=new OutputStreamWriter(os,"UTF-8");
		
		String data="������ �������̴�.";
		writer.write(data);
		writer.flush();
		
		data="������ �����ؿ�";
		writer.write(data);
		writer.flush();
		
		writer.close();
		

	}

}
