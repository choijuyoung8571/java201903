package java10;

public class MyShop {

	public static void main(String[] args) {
		int milk = 2000;
		int coffee = 4000;
		int icecream = 3000;
		int bread = 5000;
		
		// 1. 물건값 계산
		Cal cal = new Cal();
		int total = cal.add(milk, coffee);
		
		// 2. 영수증 발행 : 전체 지불금액, 봄 할인 (-1000원) 후 지불 금액
		System.out.println("전체 지불 금액 :"+total+"원");
		System.out.println("봄 할인 후 지불 금액:"+(total-1000)+"원");
		System.out.println("감사합니다. 다음에 또 들러주세요.");
		System.out.println("--------------------");
		
		// 빵 2개, 아이스크림 3개의 총 가격
		int b = cal.mul(bread, 2);
		int ice = cal.mul(icecream, 3);
		int sum = b + ice;
		System.out.println("전체 지불 금액 :"+sum+"원 입니다.");
		
		// 더치페이 하고싶다!
		int each = cal.div(sum, 5);
		System.out.println("한 사람당 "+each+"원을 내면 됩니다.");
		
		// 손님 환영 문자 출력
		String name = cal.welcome("최주영");
		System.out.println(name+"님 환영합니다!");
		
		// 손님이름과 포인트 출력
		String point = cal.point("최주영", "10000");
		System.out.println(point);
	}

}
