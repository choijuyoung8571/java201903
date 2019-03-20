package ifTest;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("짜장면집입니다~!!!");
		System.out.println("-----------------------------------------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("-----------------------------------------");
		System.out.println("1)짜장면[4000원]  2)짬뽕[4500원]  3)우동[5000원]");
		System.out.println("-----------------------------------------");
		System.out.print("당신의 선택은? >>> ");
		int choice = sc.nextInt();
		System.out.print("주문 수량은? >>> ");
		int count = sc.nextInt();
		
		String food = null;
		int price = 0;
		int jajang = 4000;
		int jambong = 4500;
		int woodong = 5000;
		if(choice == 1) {
			food = "짜장면";
			price = count * jajang;
		} else if (choice == 2) {
			food = "짬뽕";
			price = count * jambong;
		} else {
			food = "우동";
			price = count * woodong;
		}
		System.out.println("당신의 선택은 "+food+"입니다.");
		System.out.println("총 가격은 "+price+"원 입니다.");
		
		//만원이상 구매시, 2000원할인
		if (price >= 10000) {
			System.out.println("할인받아 지불하실 금액은 "+(price-2000)+"원 입니다.");
		} else {
			System.out.println("만원 미만 구매로 할인적용 불가 - 총 가격 : "+price);
		}
		
		System.out.println("맛있게 드세요~!!!");
	}

}
