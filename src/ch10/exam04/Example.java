package ch10.exam04;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] arr =new String[3];
		while(true) {
			try {
				System.out.println("������ġ");
				int index=Integer.parseInt(scanner.nextLine());
				System.out.println("�����Ұ�");
				arr[index]=scanner.nextLine();
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("0~"+(arr.length)+"���� �����մϴ�.");
				return;
			}
			catch(Exception e){
				System.out.println("���ڸ� �����մϴ�.");

			}
			finally {
				System.out.println("�ٽ� �Է��ϼ���");
				
			}
		}
		
	}

}