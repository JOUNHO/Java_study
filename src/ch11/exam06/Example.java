package ch11.exam06;

import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		//��ȭ��ȣ üũ
		String regExp="010-\\d{3,4}-\\d{4}";
		String data="010-233-1234";
		boolean result=Pattern.matches(regExp, data);
		if(result) {
			System.out.println("��ȿ�� ������");
		}
		else {
			System.out.println("�߸��� ������");
		}
		
		String regex = ".*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*";
		String password="wjddns853";
		boolean result2=Pattern.matches(regex, password);
		if(result2) {
			System.out.println("��ȿ�� ������");
		}
		else {
			System.out.println("�߸��� ������");

		}
	}

}
