package java10;

public class Phone {
	// ������ Ư¡
	String model;
	String color;
	String tele;
	
	// ������ Ư¡
	public void music() {
		System.out.println("������ ��´�.");
	}
	public void call() {
		System.out.println("��ȭ�� �ɴϴ�. ������~");
	}
	
	@Override
	public String toString() {
		return "color ="+color+", model ="+model+", tele ="+tele;
	}
}
