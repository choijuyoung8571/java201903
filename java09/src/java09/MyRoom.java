package java09;

public class MyRoom {

	public static void main(String[] args) {
		
		// tv �޼ҵ带 �ҷ� ����ʹ�.
		Tv tv = new Tv();
		tv.shape = "�׸�";
		tv.size = 10;
		tv.on();
		tv.off();
		tv.change();
		System.out.println("---------------");
		
		// tv �޼ҵ带 �ϳ� �� �߰�!
		Tv tv2 = new Tv();
		tv2.shape = "���׶��";
		tv2.size = 20;
		tv2.on();
		tv2.off();
		tv2.change();
		System.out.println("---------------");
		
		// Dog �޼ҵ� ȣ��
		Dog dog = new Dog();
		dog.age = 10;
		dog.color = "���������";
		dog.shake();
		dog.bark();
		System.out.println("---------------");
		
		// Phone �޼ҵ� ȣ��
		Phone phone = new Phone();
		phone.color = "������";
		phone.model = "������ 8";
		phone.call();
		phone.alarm();
	}

}
