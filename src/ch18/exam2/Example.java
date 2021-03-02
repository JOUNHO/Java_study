package ch18.exam2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		String filePath="D:\\UnoProjects\\Java_study\\src\\ch18\\exam2\\data.txt";
		try {
			InputStream is = new FileInputStream(filePath);
			
			byte[] data=new byte[3];
			
			//规过1
//			while(true) {
//				int readNum=is.read(data);
//				if(readNum==-1) {
//					break;
//				}
//				System.out.println(readNum+": "+Arrays.toString(data));
//			}
		
			//规过2
			
			int readNum=-1;
			while((readNum=is.read(data))!=-1) {
				for(int i=0;i<readNum;i++) {
					System.out.println(data[i]);
				}
			}
			is.close();
			
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
