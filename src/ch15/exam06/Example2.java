package ch15.exam06;

import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		TreeMap<String,String> map=new TreeMap<>();
		
		map.put("s1","박길순");
		map.put("s3","홍길동");
		map.put("s4","감자바");
		map.put("s2","개발자");
		map.put("s5","디자이너");

		
		
		for(String key: map.keySet()) {
			System.out.println(key+":"+map.get(key));
			
		}
		System.out.println();
		
		for(String key:map.descendingKeySet()) {
			System.out.println(key+":"+map.get(key));
		}
		System.out.println();
		
		Map<String,String> smap=map.subMap("s3", true, "s5", true);
		for(String key:smap.keySet()) {
			System.out.println(key+":"+smap.get(key));
		}
		
		
	}

}
