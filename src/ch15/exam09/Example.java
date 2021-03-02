package ch15.exam09;

import java.util.Stack;

public class Example {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("조운호");
		stack.push("비둘기");
		
		while(!stack.empty()) {
			String item =stack.pop();
			System.out.println(item);
		}
	}

}
