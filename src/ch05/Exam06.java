package ch05;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 생성
		String[] arr1=new String[3];
		
		//배열 항목의 값을 읽고 출력
		for(int i=0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		//배열 항목의 값을 변경
		arr1[0]="홍길동";
		arr1[1]="홍자바";
		arr1[2]="홍개발";
		
		for(int i=0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println(arr1[0].equals("홍길동"));
	}

}
