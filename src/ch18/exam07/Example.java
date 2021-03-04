package ch18.exam07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Example {

	public static void main(String[] args) {
		String filePath="F:\\Java_study\\Java_study\\src\\ch18\\exam07\\data.txt";
		try {
			Reader reader=new FileReader(filePath);
			/*			FileInputStream fis=new FileInputStream(filePath);
						Reader reader=new InputStreamReader(fis,"UTF-8");*/
			
			//规过1
			/*while(true) {
				int charCode=reader.read();
				if(charCode==-1) {
					break;
				}
				else {
					char data=(char)charCode;
					System.out.println(charCode+":"+data);
				}
			}*/
			
			//规过2
			int charCode=-1;
			while((charCode=reader.read())!=-1) {
				System.out.println((char)charCode);
			}
			reader.close();
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
