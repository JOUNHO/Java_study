package ch06.exam12;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//올바른 사용 방법
		System.out.println(Calculator.pi);
		Calculator.plus(3,5);
		
		//잘못된 사용 방법
		Calculator calculator=new Calculator();
		System.out.println(calculator.pi);

	}

}
