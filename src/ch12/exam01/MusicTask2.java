package ch12.exam01;

public class MusicTask2 implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("음악을 연주 합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}

}
