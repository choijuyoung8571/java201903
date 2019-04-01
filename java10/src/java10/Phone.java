package java10;

public class Phone {
	// 정적인 특징
	String model;
	String color;
	String tele;
	
	// 동적인 특징
	public void music() {
		System.out.println("음악을 듣는다.");
	}
	public void call() {
		System.out.println("전화가 옵니다. 따르릉~");
	}
	
	@Override
	public String toString() {
		return "color ="+color+", model ="+model+", tele ="+tele;
	}
}
