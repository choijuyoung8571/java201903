package array;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 점수 저장받을 배열 선언
		int[] eng = new int[3];
		int[] mat = new int[3];
		
		// 3명 학생의 점수 입력받기
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1)+"번째 학생의 영어점수 입력 :");
			eng[i] = sc.nextInt();
			System.out.print((i+1)+"번째 학생의 수학점수 입력 :");
			mat[i] = sc.nextInt();
		}
		
		// 3명 학생의 영어, 수학 점수 평균 구하기
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 = sum1 + eng[i];
			sum2 = sum2 + mat[i];
		}
		// 평균 출력
		System.out.println("3명 학생들의 영어점수 평균 :"+sum1/3.0);
		System.out.println("3명 학생들의 수학점수 평균 :"+sum2/3.0);
	}
}

