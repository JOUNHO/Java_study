package ch06.exam13;

public class Singleton {
	
	/*
	 * static int method1() { return 1; }
	 * 
	 * static String method2() { return "자바"; }
	 * 
	 * static int[] method3() { int[] arr= {10,20,30}; return arr; }
	 */
	private static Singleton singleton =new Singleton();
	
	//생성자
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		
		return singleton;
	}

}
