package java09;

public class Tv {
	
	// 정적 특징(변수) - 모양, 크기
	String shape;
	int size;
	
	
	// 동적 특징(메소드) - 켜다, 끄다, 채널을 바꾸다.
	public void on() {
		System.out.println("TV를 켜다.");
	}
	
	public void off() {
		System.out.println("TV를 끄다.");
	}
	public void change() {
		System.out.println("TV 채널을 바꾸다.");
	}
	
}
