package ch04homework;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run =true;
		int balance =0;
		Scanner sc=new Scanner(System.in);
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("����> ");
			
			int num=Integer.parseInt(sc.nextLine());
			if(num==1) {
				System.out.print("���ݾ�>");
				balance=balance+Integer.parseInt(sc.nextLine());
			}
			else if(num==2) {
				System.out.print("��ݾ�>");
				balance=balance-Integer.parseInt(sc.nextLine());
			}
			else if(num==3) {
				System.out.print("�ܰ�>"+balance);
			}
			else {
				run=false;
				System.out.println();
				System.out.println("���α׷� ����");
			}
			System.out.println();
		}

	}

}
