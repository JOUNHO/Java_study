package ch12.exam01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ������ ����");
		
		//��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		Thread thread1 = new Thread(new NetworkTask());
		thread1.start();	//run�� ����
		
		//���� �۾��� �ϴ� ������ ������ ����
		Thread thread2 = new Thread(new MusicTask2());
		thread2.start();
		
		//ä�� �۾��� �ϴ� ������ ������ ����
		Thread thread3=new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					System.out.println("ä�� �۾��� �մϴ�.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

					}
				}
			}});
		
		thread3.start();
		
		while(true) {
			System.out.println("���� �۾��� �մϴ�.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}

}
