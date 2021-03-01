package ch15.exam02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		List<String> list2=new LinkedList<String>();
		
		long start,end;
		start=System.nanoTime();
		for(int i=0;i<10000;i++) {
			list1.add(0,String.valueOf(i));
		}
		end=System.nanoTime();
		
		System.out.println("ArrayList 걸린시간:"+(end-start));
		
		start=System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0,String.valueOf(i));
		}
		end=System.nanoTime();
		System.out.println("LinkedList 걸린시간:"+(end-start));

	}

}
