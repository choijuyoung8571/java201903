package array;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] num = new int[5];
		
		// 1. 다섯명의 학생에 대한 성적을 입력받고싶다.
		for (int i = 0; i < 5; i++) { 
			// 2. 입력 : 이름+점수
			System.out.print("이름을 입력하세요.>>> ");
			name[i] = sc.next();
			System.out.print("점수를 입력하세요.>>> ");
			num[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(name[i]+"의 점수 : "+num[i]);
		}
		
		// 3. 전체 학생의 평균을 내고싶다.
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		
		double avg = sum / 5;
		System.out.println("5명 학생의 평균 : "+avg);
		
	}
}

