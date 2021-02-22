package ch06.exam10;

public class Example {

	public static void main(String[] args) {
		Changer changer=new Changer();
		
		//Call by Value(���� �����ؼ� ȣ��)
		int value=1;
		changer.change(value);
		System.out.println(value);
		
		//Call by Reference(������ �����ؼ� ȣ��)
		String v3="A";
		changer.change(v3);
		System.out.println(v3);
		
		//Call by Reference(������ �����ؼ� ȣ��)
		int[] arr1= {0,0,0};
		changer.change(arr1);
		System.out.println(arr1[0]);
		
		String[] arr3= {"A","B","C"};
		changer.change(arr3);
		System.out.println(arr3[0]);
		
		Member member=new Member();
		System.out.println(member.age);
		changer.change(member);
		System.out.println(member.age);

	}

}
