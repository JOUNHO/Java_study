package ch15.exam09;

import java.util.Stack;

public class Example {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("ȫ�浿");
		stack.push("����ȣ");
		stack.push("��ѱ�");
		
		while(!stack.empty()) {
			String item =stack.pop();
			System.out.println(item);
		}
	}

}
