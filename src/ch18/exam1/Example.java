package ch18.exam1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) throws IOException {
		
		String filePath="D:\\UnoProjects\\Java_study\\src\\ch18\\exam1\\data.txt";
		try {
			InputStream is=new FileInputStream(filePath);
			
			//방법1
//			while(true) {
//				int data=is.read();
//				if(data==-1) {
//					break;
//				}
//				System.out.println((char)data);
//
//			}
			//방법2
			int data=-1;
			while((data=is.read())!=-1) {
			System.out.print((char)data);

			}
			
		

		} catch (FileNotFoundException e) {
			System.out.println("파일을 못찾았습니다.");
		}
	}

}
