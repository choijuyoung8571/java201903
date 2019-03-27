package array;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// 배열에 입력값을 받아서 저장 --> 계산...
		
		// random값을 배열에 넣어봅시다.
		Random random = new Random(); // (=) Math.random();		
		int[] lotto = new int[6];
		
		// random값 6개 추출 -> 반복문 6번 
		for (int i = 0; i < 6; i++) {
			lotto[i] = random.nextInt(46); // 0~45까지 숫자 발생시키려면 45+1인 46으로 범위지정
		}
		
		// 저장받은 random 변수 출력
		for (int i : lotto) {
			System.out.print(i+" ");
		}
		
	}

}
