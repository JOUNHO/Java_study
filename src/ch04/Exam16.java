package ch04;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ű����� �Է��� ������ �ޱ� ���� Scanner ����
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("����1: ");
			double num1=Double.parseDouble(sc.nextLine());
			
			System.out.print("����2: ");
			double num2=Integer.parseInt(sc.nextLine());
			
			double result=num1+num2;
			System.out.println("���: "+result);
		}


	}

}
