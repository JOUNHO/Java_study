package ch18.exam16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws IOException {
		
		//방법 1
//		InputStream is=System.in;
//		byte[] data=new byte[1024];
//		int readNum=is.read(data);
//		String str=new String(data,0,readNum);
//		System.out.println(str);
//		
//		readNum=is.read(data);
//		str=new String(data,0,readNum);
//		System.out.println(str);
		
		//방법2 보조스트림 이용
		InputStream is=System.in;
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String str=br.readLine();
		System.out.println(str);
		str=br.readLine();
		System.out.println(str);
	}

}
