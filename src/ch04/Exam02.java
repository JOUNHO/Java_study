package ch04;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='A';
		
		switch(grade) {
			case 'A':
				System.out.println("Ŀ�Ǹ� �����մϴ�.");
				//break;
			case 'B':
				System.out.println("���� �ϳ��� �ݴϴ�.");
				break;
			case 'C':
				System.out.println("�λ縸 �մϴ�.");
				break;
			default:
				System.out.println("�Ű澲�� �ʽ��ϴ�.");
		}
		
		//-----------------------------------------------
		
		if(grade=='A') {
			System.out.println("Ŀ�Ǹ� �����մϴ�.");
			System.out.println("���� �ϳ��� �ݴϴ�.");
		}
		else if(grade=='B') {
			System.out.println("���� �ϳ��� �ݴϴ�.");
		}
		else if(grade=='B') {
			System.out.println("�λ縸 �մϴ�.");
		}
		else {
			System.out.println("�Ű澲�� �ʽ��ϴ�.");
		}
	}

}
