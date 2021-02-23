package ch07.exam11;

public class Cat extends Animal{

	@Override	
	public void sound() {
		System.out.println("야옹");
	}
	
	public void keepHome() {
		System.out.println("방범 활동을 해요");
	}
}
