package ch05;

import java.util.Arrays;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"�ȳ�","�ϼ���"};
		String[] arr2=arr;
		
		arr2[1]="�Ͻʴϱ�";
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

		String[] arr3= {"�ȳ�","�ϼ���"};
		String[] arr4=new String[arr3.length];
		for(int i=0;i<arr3.length;i++) {
			arr4[i]=arr3[i];
		}
		arr4[1]="�Ͻʴϱ�";

		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));


	}

}
