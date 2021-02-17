package ch04;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//키보드로 입력한 내용을 받기 위해 Scanner 생성
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자1: ");
			double num1=Double.parseDouble(sc.nextLine());
			
			System.out.print("숫자2: ");
			double num2=Integer.parseInt(sc.nextLine());
			
			double result=num1+num2;
			System.out.println("결과: "+result);
		}


	}

}
