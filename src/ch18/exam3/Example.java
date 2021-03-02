package ch18.exam3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		String filePath="D:\\UnoProjects\\Java_study\\src\\ch18\\exam3\\data.txt";
		try {
			InputStream is = new FileInputStream(filePath);
			
			byte[] data=new byte[8];
			
					
			//¹æ¹ý2
			int readNum=-1;
			while((readNum=is.read(data,2,3))!=-1) {
				System.out.println(readNum+":"+Arrays.toString(data));
			}
			is.close();
			
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
