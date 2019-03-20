package input;

import java.util.Scanner;

public class InputStart3 {

	public static void main(String[] args) {
		
	// 나이를 입력받아, 18세 이상이면 성년으로, 18세 미만이면 미성년으로 출력
		System.out.print("나이를 입력하세요.>>>");
		Scanner sc2 = new Scanner(System.in);
		int age = sc2.nextInt();
		if(age >= 18) {
			System.out.println("성년이십니다.");
		}else {
			System.out.println("미성년이십니다.");
		}
		
	}

}
