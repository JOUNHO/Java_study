package ch06.exam08;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoardService bs = new BoardService(100,5);
		
		
		bs.create(null, null, null, 1);
		bs.create(null, null, null, 1);

		bs.showList();
		
		String[] board=bs.read(2);
		for(String value: board) {
			System.out.print(value+"\t");
		}
	}

}
