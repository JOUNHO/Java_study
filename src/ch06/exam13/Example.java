package ch06.exam13;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		/*
		 * int result=Singleton.method1(); System.out.println(result); String
		 * result2=Singleton.method2(); System.out.println(result2); int[]
		 * result3=Singleton.method3(); System.out.println(Arrays.toString(result3));
		 */
		
		

		
		//생성자를 이용해서 객체 얻기
		// Singleton constructor=new Singleton();  (x)
		
		//Factory Method 이용해서 객체 얻기
		Singleton factory=Singleton.getInstance();
		Singleton factory2=Singleton.getInstance();
		if(factory==factory2) {
			System.out.println("같은 객체를 참조");
		}
		else {
			System.out.println("다른 객체를 참조");
		}
	}

}
