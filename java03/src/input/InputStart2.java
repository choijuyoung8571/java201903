package input;

import java.util.Scanner;

public class InputStart2 {

	public static void main(String[] args) {
		
		/*
		 * 나의 정보 입력
		 *-----------
		 *나이 : 24
		 *성별 : 여
		 *이름 : Choi
		 *----------- 
		 */
		Scanner sc1 = new Scanner(System.in);
		System.out.println("나의 정보 입력");
		System.out.println("----------");
		System.out.print("나이 :");
		String age = sc1.next();
		System.out.print("성별 :");
		String gender = sc1.next();
		System.out.print("이름 :");
		String name = sc1.next();
		System.out.println("----------");
		
		
		
	}

}
