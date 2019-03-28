package java09;

public class MyRoom {

	public static void main(String[] args) {
		
		// tv 메소드를 불러 오고싶다.
		Tv tv = new Tv();
		tv.shape = "네모";
		tv.size = 10;
		tv.on();
		tv.off();
		tv.change();
		System.out.println("---------------");
		
		// tv 메소드를 하나 더 추가!
		Tv tv2 = new Tv();
		tv2.shape = "동그라미";
		tv2.size = 20;
		tv2.on();
		tv2.off();
		tv2.change();
		System.out.println("---------------");
		
		// Dog 메소드 호출
		Dog dog = new Dog();
		dog.age = 10;
		dog.color = "노란강아지";
		dog.shake();
		dog.bark();
		System.out.println("---------------");
		
		// Phone 메소드 호출
		Phone phone = new Phone();
		phone.color = "검정색";
		phone.model = "아이폰 8";
		phone.call();
		phone.alarm();
	}

}
