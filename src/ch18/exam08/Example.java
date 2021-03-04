package ch18.exam08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		String filePath="F:\\Java_study\\Java_study\\src\\ch18\\exam08\\data.txt";
		try {
			Reader reader=new FileReader(filePath);
			/*			FileInputStream fis=new FileInputStream(filePath);
						Reader reader=new InputStreamReader(fis,"UTF-8");*/
			

			char[] data=new char[1024];
			int readNum=-1;
			String str="";
			while((readNum=reader.read(data))!=-1) {
					str+=new String(data,0,readNum);
			}
			System.out.println(str);

			reader.close();
			
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
