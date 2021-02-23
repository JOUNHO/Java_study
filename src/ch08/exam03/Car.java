package ch08.exam03;

public class Car implements Shipable,Flyable{

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("이륙합니다.");
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("착륙합니다.");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("비행합니다.");	
	}

	@Override
	public void sailing() {
		// TODO Auto-generated method stub
		System.out.println("항해합니다.");
	}

	@Override
	public void anchor() {
		// TODO Auto-generated method stub
		System.out.println("정박합니다.");
	}

}
