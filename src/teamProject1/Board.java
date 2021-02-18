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
			System.out.println("1.목록| 2.생성(Create) | 3.읽기(Read) |"
					+ " 4.수정(Update) | 5.삭제(Delete) | 6.종료");
			System.out.println("-------------------------------------------");
			System.out.println("메뉴선택: ");
			selectNo=sc.nextInt();
			
			if(selectNo==1) {
				
			}
		}
		
	}

}
