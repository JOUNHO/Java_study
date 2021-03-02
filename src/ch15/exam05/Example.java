package ch15.exam05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Example {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties prop=new Properties();
		String path=Example.class.getResource("database.properties").getPath();
		prop.load(new FileReader(path));
		String driver=prop.getProperty("driver");
		System.out.println(driver);
		
		String nation=prop.getProperty("nation");
		System.out.println(nation);
	}

}
