package ch06.exam08;

import teamProject1.Board;

public class BoardService {
	
	//Field
	int count;
	String[][] boards;
	
	//Constructor
	BoardService(int rows, int columns){
		boards=new String[rows][columns];
	}
	
	//Method
	
	
	int getNewBno() {
		return ++count;
	}
	
	//생성
	void create(String title, String content,String author,int views) {
		String[] board= {String.valueOf(this.getNewBno()), title,content,author,String.valueOf(views)};
		
		for(int i=0;i<boards.length;i++) {
			if(boards[i][0]==null) {
				boards[i]=board;
				break;
				
			}
		}
	}
	
	
	void showList() {
		System.out.println("번호\t제목\t내용\t글쓴이\t조회수");
		for(int i=0;i<boards.length;i++) {
			if(boards[i][0]!=null) {
				for(String list:boards[i]) {
					System.out.print(list+"\t");
				}
				System.out.println();
			}
		}
	}
	
	String[] read(int num) {
		String[] result=null;
		String listnum=""+num;
		for(int i=0;i<boards.length;i++) {
			if(boards[i][0]!=null) {
				if(boards[i][0].equals(listnum)) {
					result= boards[i];
					break;
				}
			}
		}
		
		return result;
	}
	

}
