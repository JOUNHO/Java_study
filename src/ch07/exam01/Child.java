package ch07.exam01;

public class Child extends Parent{
	
	
	public Child(String firstName) {
		super("±è",firstName);
		System.out.println("childÀÇ »ý¼ºÀÚ°¡ ½ÇÇàµÊ");
	}
	
	public void method2() {
		System.out.println("method2(Child)");
	}
}
