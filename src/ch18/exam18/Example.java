package ch18.exam18;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) throws Exception{
		String filePath1="F:\\Java_study\\Java_study\\src\\ch18\\exam18\\data.db";
		OutputStream os=new FileOutputStream(filePath1);
		DataOutputStream dos=new DataOutputStream(os);
		
		dos.writeInt(3);   //4
		dos.writeDouble(10.5); //8
		dos.writeBoolean(true); //1
		dos.writeUTF("ȫ�浿"); //9
		dos.flush();
		dos.close();
	}

}
