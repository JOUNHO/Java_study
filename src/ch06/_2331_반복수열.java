package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2331_반복수열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String A=sc.next();
		int P=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(Integer.parseInt(A));
		boolean check=true;
		int result=0;
		int AP=0;
		while(check) {
			int num=A.length();
			for(int i=num-1;i>=0;i--) {
				AP=AP+(int)Math.pow(Integer.parseInt(A.substring(i,i+1)),P);
				}
			
			A=Integer.toString(AP);
			if(list.contains(Integer.parseInt(A))) {
				check=false;
				result=	list.indexOf(Integer.parseInt(A));

			}
			else {
				list.add(Integer.parseInt(A));
				AP=0;
			}
		}
			System.out.println(result);			
	}
}

