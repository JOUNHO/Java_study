package ch04;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='A';
		
		switch(grade) {
			case 'A':
				System.out.println("커피를 대접합니다.");
				//break;
			case 'B':
				System.out.println("사탕 하나만 줍니다.");
				break;
			case 'C':
				System.out.println("인사만 합니다.");
				break;
			default:
				System.out.println("신경쓰지 않습니다.");
		}
		
		//-----------------------------------------------
		
		if(grade=='A') {
			System.out.println("커피를 대접합니다.");
			System.out.println("사탕 하나만 줍니다.");
		}
		else if(grade=='B') {
			System.out.println("사탕 하나만 줍니다.");
		}
		else if(grade=='B') {
			System.out.println("인사만 합니다.");
		}
		else {
			System.out.println("신경쓰지 않습니다.");
		}
	}

}
