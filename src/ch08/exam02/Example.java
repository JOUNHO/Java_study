package ch08.exam02;

public class Example {

	public static void method(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc=new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		method(new Television());
		method(new Audio());

	}

}
