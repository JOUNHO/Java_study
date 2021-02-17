package ch04homework;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		int i=1;
		
		while(i<=100) {
			sum=sum+i;
			i++;
		}
		System.out.println("1~"+(i-1)+" гу : "+sum);
	}

}
