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
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			int num=Integer.parseInt(sc.nextLine());
			if(num==1) {
				System.out.print("예금액>");
				balance=balance+Integer.parseInt(sc.nextLine());
			}
			else if(num==2) {
				System.out.print("출금액>");
				balance=balance-Integer.parseInt(sc.nextLine());
			}
			else if(num==3) {
				System.out.print("잔고>"+balance);
			}
			else {
				run=false;
				System.out.println();
				System.out.println("프로그램 종료");
			}
			System.out.println();
		}

	}

}
