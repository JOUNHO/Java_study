package ch15.exam03;

import java.util.HashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		Set<User> set=new HashSet<User>();
		
		User user=new User("winter","�Ѱܿ�");
		User user2=new User("winter","�Ѱܿ�");

		set.add(user);
		set.add(user2);
		System.out.println(user.hashCode()==user2.hashCode());
		System.out.println(user.equals(user2));
		System.out.println(set.size());
	}
}
