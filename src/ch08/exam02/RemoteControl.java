package ch08.exam02;

public interface RemoteControl {
	//»ó¼ö
	String COMPANY="»ï¼º";
	int MAX_VOLUME=10;
	int MIN_VOLUME=1;
	
	//¸Þ¼Òµå(°´Ã¼ »ç¿ë ¼´¸í)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
