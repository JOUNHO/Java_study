package ch04;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//키보드로 입력한 내용을 받기 위해 Scanner 생성
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			//키보드에서 입력한 내용을 data 변수에 저장
			System.out.print("입력: ");
			String data= sc.nextLine();
			
			//data 변수의 값을 출력
			System.out.print("출력: ");
			System.out.println(data);
			
			if(data.equals("점심시간")) {
				break;
			}
		}


	}

}
