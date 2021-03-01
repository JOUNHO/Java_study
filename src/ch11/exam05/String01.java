package ch11.exam05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class String01 {
	public static void main(String[] args) throws Exception{
		byte[] arr= {65,66,67};
		String str=new String(arr);
		System.out.println(str);
		
		String str2="ABC";
		byte[] arr2=str2.getBytes();
		System.out.println(Arrays.toString(arr2));
		
		String str3="가나다";
		byte[] arr31=str3.getBytes("EUC-KR");//한글을 2바이트로 표현
		byte[] arr32=str3.getBytes("UTF-8"); //한글을 3바이트로 표현
		System.out.println(Arrays.toString(arr31));
		System.out.println(Arrays.toString(arr32));
			
		String str4=new String(arr31,"EUC-KR");
		String str5=new String(arr32,"UTF-8");
		
		System.out.println(str4);
		System.out.println(str5);

	}
}
