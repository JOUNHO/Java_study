package ch11.exam06;

import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		//전화번호 체크
		String regExp="010-\\d{3,4}-\\d{4}";
		String data="010-233-1234";
		boolean result=Pattern.matches(regExp, data);
		if(result) {
			System.out.println("유효한 데이터");
		}
		else {
			System.out.println("잘못된 데이터");
		}
		
		String regex = ".*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*";
		String password="wjddns853";
		boolean result2=Pattern.matches(regex, password);
		if(result2) {
			System.out.println("유효한 데이터");
		}
		else {
			System.out.println("잘못된 데이터");

		}
	}

}
