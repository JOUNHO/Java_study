package ch11.exam05;

import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {
		String ssn="123456-1234567";
		
		//��� ��ġ�� ���� 1���� ���
		char sex=ssn.charAt(7);
		if(sex=='1' ||sex=='3') {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
		
		//���ڿ� �߶󳻱�: ���1 
		String first=ssn.substring(0,6);
		String second=ssn.substring(7);
		System.out.println(first);
		System.out.println(second);
		
		//���ڿ� �߶󳻱�: ���2
		String[] parts=ssn.split("-");
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		
		//���ڿ� �и��ϱ�: ���3
		StringTokenizer st=new StringTokenizer(ssn,"-");
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		}
		/*		first=st.nextToken();
				second=st.nextToken();
				String third=st.nextToken();
				System.out.println(first);
				System.out.println(second);*/
		
		//���� ����: ���1
		String title="�̰��� �ڹ� å�Դϴ�.";
		boolean result=title.contains("�ڹ�"); //true
		boolean result2=title.contains("C++");
		System.out.println(result);
		System.out.println(result2);
		
		//���� ����: ���2
		int index=title.indexOf("�ڹ�");
		if(index!=-1) {
			System.out.println("�ش� ���� "+index+"��ġ�� ����");
		}
		else {
			System.out.println("�ش� ���� ����X");
		}
		
		//���ڿ��� ����
		int length=title.length();
		System.out.println(length);
		
		//��ġ�ϱ�
		String modifiedtitle=title.replace("�ڹ�", "java");
		System.out.println(modifiedtitle);
	}

}
