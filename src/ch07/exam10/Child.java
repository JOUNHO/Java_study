package ch07.exam10;

public class Child extends Parent{
	
	public int field2;

	@Override
	public void method2() {
		System.out.println("method2(Child)");
	}
	
	public void method3() {
		System.out.println("method3(Child)");
	}
}
