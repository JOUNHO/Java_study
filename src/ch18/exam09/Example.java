package ch18.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class Example {

	public static void main(String[] args) {
		String filePath = "F:\\Java_study\\Java_study\\src\\ch18\\exam09\\data.txt";
		try {
			Writer writer = new FileWriter(filePath);
			
			writer.write(new char[] {'A','��'});
			writer.write(new char[] {'B','��','C','D'},0,2);
			writer.write("������ ������ ȭâ�մϴ�.");
			

			writer.flush();
			writer.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}