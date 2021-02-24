package ch10.exam06;

public class Example {

	public static void main(String[] args) {
		Account account=new Account();
		
		String ano=null;
		try {
			account.deposit(ano, 1000);
		}
		catch(NoAccountException e){
			System.out.println(e.getMessage());
		}
		
		String ano1="111-222-333";
		try {
			account.withdraw(ano1, 1000);
			System.out.println("출금 성공1");
			account.withdraw(ano1, 20000);
			System.out.println("출금 성공2");
		} catch (NoAccountException e) {
			System.out.println(e.getMessage());
		} catch (BalanceLackException e) {
			System.out.println(e.getMessage());
		}
	}

}
