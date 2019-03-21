package whileTest;

import java.util.Random;
import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// 숫자를 추측하여 정답 숫자를 맞추는 프로그램
		Random random = new Random();
		int target = random.nextInt(100);
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while (true) {
		// 시도한 횟수 카운트
		count++;
		// 생각한 숫자를 입력
		System.out.print("생각한 숫자를 입력 >>> ");
		int input = sc.nextInt();
		// 정답과 비교 
		if (input == target) {
			System.out.println("축하합니다.정답입니다!!");
			break;
		} else {
			System.out.println("다시 입력하세요...");
			// 정답숫자에 대한  Hint!
			if (input > target) {
				System.out.println("더 작은 수를 입력해주세요.");
			} else {
				System.out.println("더 큰 수를 입력해주세요.");
			} //else
		} //else
		
		} //while
		System.out.println("당신이 시도한 횟수 : "+count);
		
	} //main

} //class
