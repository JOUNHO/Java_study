package ch18.exam14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		String filePath="F:\\Java_study\\Java_study\\src\\ch18\\exam14\\data.txt";
		InputStream is;
		try {
			is = new FileInputStream(filePath);
			Scanner sc=new Scanner(is);
			int count=1;
			while(true) {
				try {
					String data=sc.nextLine();
					System.out.println(count+": "+data);
					count++;
				} catch(NoSuchElementException e) {
					break;
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
