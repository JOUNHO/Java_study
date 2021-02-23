package ch07.exam08;

public class Car {
	//field
	public Tire t1;
	public Tire t2;
	public Tire t3;
	public Tire t4;
	//constructor
	public Car() {
		t1=new Tire();
		t2=new Tire();
		t3=new Tire();
		t4=new Tire();
	}
	//method
	public void run() {
		t1.roll();
		t2.roll();
		t3.roll();
		t4.roll();
	}
}
