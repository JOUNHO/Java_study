package ch05;

public class Exam09 {

	public static void main(String[] args) {
		
		int[][] scores= {
				{10,20},
				{15,25,35},
				{45,55,65,75}
		};
		
		System.out.println(scores.length); //3
		System.out.println(scores[0].length); //2
		System.out.println(scores[1].length); //3
		System.out.println(scores[2].length); //4
		
		int sum=0;
		int num=0;
		for(int i=0;i<scores.length;i++) {	
			for(int j=0;j<scores[i].length;j++) {
				sum=sum+scores[i][j];
				num++;
			}
		}
		double avg=(double)sum/num;
				
		System.out.println("avg: "+ avg);

	}

}
