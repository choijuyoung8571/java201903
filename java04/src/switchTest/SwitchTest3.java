package switchTest;

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 회사 ID를 입력하세요..>> ");
		String id = sc.next();
		// 입력받은 값에서 몇번째 글자를 추출할 때 -> charAt(index)
		char dept = id.charAt(0);
		
		switch (dept) {
		case 'i':
			System.out.println("IT부서 입니다.");
			break;
		case'p':
			System.out.println("기획부서 입니다.");
			break;
		case's':
			System.out.println("특별부서 입니다.");
			break;
		default:
			System.out.println("해당 부서가 없어요.");
		}
	
	}

}
