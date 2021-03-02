package ch15.exam07;

public class Person implements Comparable{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(Object o) {
		Person temp=(Person) o;
		if(this.age<temp.age) {
			return -1;
		}
		else if(this.age==temp.age&&this.name.equals(temp.name)) {
			return 0;
		}
		else {
			return 1;
		}
	}
}
