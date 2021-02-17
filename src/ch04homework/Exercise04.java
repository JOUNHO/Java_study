package ch04homework;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			int noon1=(int)(Math.random()*6)+1;
			int noon2=(int)(Math.random()*6)+1;
			System.out.println("("+noon1+", "+noon2+")");
			if((noon1+noon2)==5) {
				break;
			}
		}
	}

}
