package ch07.exam02;

public class Child extends Parent{
	
	public int fiedl2;
	
	public Child() {
		System.out.println("child의 생성자가 실행됨");
	}
	
	public void method2() {
		System.out.println("method2(Child)");
	}
	
	@Override
	public void sound() {
		System.out.println("싫어요~~~~~~~~");
	}
}
