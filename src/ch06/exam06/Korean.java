package ch06.exam06;

public class Korean {
	//Field
	String nation="�ѱ�";
	String name;
	String ssn;
	int age;
	//Constructor
	Korean(){
		this("�ƹ���","00000-00000",1);
		}	
	Korean(String name){
		this(name,"00000-00000",1);

	}
	Korean(String name,String ssn){
		this(name,ssn,1);

	}
	Korean(String name,String ssn, int age){
		System.out.println("Korean(String name,String ssn) ����");
		this.name=name;
		this.ssn=ssn;
		this.age=age;
	}
	
}
