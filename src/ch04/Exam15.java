package ch04;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ű����� �Է��� ������ �ޱ� ���� Scanner ����
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			//Ű���忡�� �Է��� ������ data ������ ����
			System.out.print("�Է�: ");
			String data= sc.nextLine();
			
			//data ������ ���� ���
			System.out.print("���: ");
			System.out.println(data);
			
			if(data.equals("���ɽð�")) {
				break;
			}
		}


	}

}
