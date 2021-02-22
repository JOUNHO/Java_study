package ch06.exam11;

public class Example {
	public static void main(String[] args) {
		User user=new User("홍길동");
		System.out.println(user.name);
		user.login();
		user.logout();
		
		//정적멤버(필드, 메소드)는 객체가 없이도 사용가능
		System.out.println(User.nation);
		user.info();
		
	}
}
