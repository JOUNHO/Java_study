package ch05homework;

public class MainStringArrayargument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String strNum1=args[0];
		String strNum2=args[1];
		
		int num1=Integer.parseInt(strNum1);
		int num2=Integer.parseInt(strNum2);
		
		int result=num1+num2;
		System.out.println(num1+"+"+num2+" = "+result);

	}

}