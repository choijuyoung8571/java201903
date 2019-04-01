package java10;

public class PhoneUser {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.color  = "검정색";
		p1.model = "아이폰 8";
		p1.tele = "LG+U";
		
		Phone p2 = new Phone();
		p2.color = "골드";
		p2.model = "아이폰 x";
		p2.tele = "SKT";
		
		p1.music();
		p1.call();
		
		System.out.println("---------------");
		System.out.println(p1);
		System.out.println(p2);
	}

}
