package ch06.exam13;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		/*
		 * int result=Singleton.method1(); System.out.println(result); String
		 * result2=Singleton.method2(); System.out.println(result2); int[]
		 * result3=Singleton.method3(); System.out.println(Arrays.toString(result3));
		 */
		
		

		
		//�����ڸ� �̿��ؼ� ��ü ���
		// Singleton constructor=new Singleton();  (x)
		
		//Factory Method �̿��ؼ� ��ü ���
		Singleton factory=Singleton.getInstance();
		Singleton factory2=Singleton.getInstance();
		if(factory==factory2) {
			System.out.println("���� ��ü�� ����");
		}
		else {
			System.out.println("�ٸ� ��ü�� ����");
		}
	}

}
