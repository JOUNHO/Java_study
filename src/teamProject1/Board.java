package teamProject1;

import java.util.Scanner;

public class Board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] boardArray = new String[100][5];
		
		int num;
		String title;
		String content;
		String author;
		int views;
		
		int selectNo;
		boolean run=true;
		Scanner sc=new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.���| 2.����(Create) | 3.�б�(Read) |"
					+ " 4.����(Update) | 5.����(Delete) | 6.����");
			System.out.println("-------------------------------------------");
			System.out.println("�޴�����: ");
			selectNo=sc.nextInt();
			
			if(selectNo==1) {
				
			}
		}
		
	}

}
