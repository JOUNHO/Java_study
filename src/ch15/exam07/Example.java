package ch15.exam07;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		TreeSet<Person> set=new TreeSet<>();
		
		set.add(new Person("����",30));
		set.add(new Person("ȫ�浿",28));
		set.add(new Person("����ȣ",26));
		set.add(new Person("���ڹ�",30));


		
		for(Person person:set) {
			System.out.println(person.name+","+person.age);
		}
		
		TreeMap<Person,Integer> map=new TreeMap<>();
		map.put(new Person("ȫ�浿",28),95);
		map.put(new Person("����ȣ",26),80);
		map.put(new Person("���ڹ�",30),90);
		System.out.println();
		Set<Person> keys=map.keySet();
		for(Person p : keys) {
			System.out.println(p.name+ ","+p.age+":"+map.get(p));
		}

	}

}
