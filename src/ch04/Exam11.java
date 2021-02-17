package ch04;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		while(true) {
			System.out.println(count);
			count++;
			if(count>0.5) {
				break;
				//return;
			}
		}
		
		System.out.println("프로그램 마무리 내용 실행");

	}
}
