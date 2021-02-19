package ch06.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		Student s3=s1;
		if(s1==s2) {
			System.out.println("°°Àº °´Ã¼");
		}
		else {
			System.out.println("´Ù¸¥ °´Ã¼");
		}
	}

}
