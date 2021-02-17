package ch05homework;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldstrArray= {"java","array","copy"};
		String[] newstrArray= new String[5];
		
		System.arraycopy(oldstrArray, 0, newstrArray, 0, oldstrArray.length);
		
		for(int i=0; i<newstrArray.length;i++) {
			System.out.print(newstrArray[i]+", ");
		}		
	}

}
