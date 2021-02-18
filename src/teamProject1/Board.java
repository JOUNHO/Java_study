package teamProject1;

import java.util.Scanner;

public class Board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studentno=4;
		String[][] boardArray = new String[studentno][5];
		
		int num=0;
		String title;
		String content;
		String author;
		
		int selectNo;
		boolean run=true;
		Scanner sc=new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("1.목록| 2.생성(Create) | 3.읽기(Read) |"
					+ " 4.수정(Update) | 5.삭제(Delete) | 6.종료");
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.print("메뉴선택: ");
			selectNo=sc.nextInt(); sc.nextLine();
			
			
			//1.board
			if(selectNo==1) {
				System.out.println("번호\t제목\t내용\t글쓴이\t조회수");

				for(int i=0;i<studentno;i++) {
					for(int j=i+1;j<studentno;j++) {
						if((boardArray[i][0]==null)||(boardArray[j][0]==null)) {
							continue;
						}
						int m=Integer.parseInt(boardArray[i][0]);
						int n=Integer.parseInt(boardArray[j][0]);	
						if(m<n) {
							String[] temp=boardArray[i];
							boardArray[i]=boardArray[j];
							boardArray[j]=temp;
						}	
					}
				}
				for(int i=0;i<studentno;i++) {
					if(boardArray[i][0]!=null) {
						for(String array:boardArray[i]) {
							System.out.print(array+"\t");
						}
						System.out.println();
					}
						
			}
				
		}
			//2.Create
			else if(selectNo==2) {

				System.out.print("제목:");
				title=sc.nextLine();
				System.out.print("내용:");
				content=sc.nextLine();
				System.out.print("글쓴이:");
				author=sc.nextLine();
				boolean full=true;
				for(int i=0;i<studentno;i++) {
					if(boardArray[i][0]==null) {
						boardArray[i][0]=Integer.toString(num+1);
						boardArray[i][1]=title;
						boardArray[i][2]=content;
						boardArray[i][3]=author;
						boardArray[i][4]="0";
						num++;
						full=false;
						break;
					}
				}
				if(full==true) {
					System.out.println("게시판이 꽉찼습니다.");
				}
				

				
			}
			//3.Read
			else if(selectNo==3) {
				int no;
				System.out.print("번호: ");
				no=sc.nextInt();sc.nextLine();
				int i;
				for(i=0;i<studentno;i++) {
					if(boardArray[i][0]==null) {
						continue;
					}
					if(no==Integer.parseInt(boardArray[i][0])) {
						break;
					}
				}
				if(i>=studentno) {
					System.out.println("잘못 입력하셨습니다.");
				}
				else {
					int views=Integer.parseInt(boardArray[i][4]);
					views++;
					boardArray[i][4]= Integer.toString(views);
					System.out.println("제목:"+boardArray[i][1]);
					System.out.println("내용:"+boardArray[i][2]);
					System.out.println("글쓴이:"+boardArray[i][3]);
					System.out.println("조회수:"+boardArray[i][4]);
					System.out.println();
				}
				
			}
			//4.Update
			else if(selectNo==4) {
				int no;
				
				System.out.print("번호: ");
				no=sc.nextInt();sc.nextLine();
				int i;
				for(i=0;i<studentno;i++) {
					if(boardArray[i][0]==null) {
						continue;
					}
					if(no==Integer.parseInt(boardArray[i][0])) {
						break;
					}
				}
				if(i>=studentno) {
					System.out.println("잘못 입력하셨습니다.");
				}
				else {
					System.out.println("기존제목: "+boardArray[i][1]);
					System.out.print("수정제목: ");
					String modifytitle=sc.nextLine();
					if(!modifytitle.equals("")) {
						boardArray[i][1]=modifytitle;
					}
					
					System.out.println("기존내용: "+boardArray[i][2]);
					System.out.print("수정내용: ");
					String modifycontent=sc.nextLine();
					if(!modifycontent.equals("")) {
						boardArray[i][2]=modifycontent;
					}
				}
				
				
				//자동으로 목록으로 이동
				
				
				
			}
			//5.Delete
			else if(selectNo==5) {
				int no;
				System.out.print("번호: ");
				no=sc.nextInt();sc.nextLine();
				int i;
				for(i=0;i<studentno;i++) {
					if(boardArray[i][0]==null) {
						continue;
					}
					if(no==Integer.parseInt(boardArray[i][0])) {
						break;
					}
				}
				
				for(int j=0;j<5;j++) {
					if(i>=studentno) {
						System.out.println("잘못 입력하셨습니다.");
						break;
					}
					boardArray[i][j]=null;
				}
			}
			//6.Exit
			else if(selectNo==6) {
				run=false;
				System.out.println("프로그램 종료");
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
	}

}
