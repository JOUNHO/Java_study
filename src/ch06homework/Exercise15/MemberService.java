package ch06homework.Exercise15;

public class MemberService {

	public boolean login(String id,String password) {
		if(id.equals("hong")&&password.equals("12345")) {
			return true;
		}
		else {
			return false;

		}
	}
	
	public void logout(String id) {
		if(id.equals("hong")) {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("�α׾ƿ� �����߽��ϴ�..");

		}
	}

}