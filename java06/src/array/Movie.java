package array;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0; // 예매 인원 세는 변수
		int[] seat = new int[10]; // 자리를 위한 배열

		System.out.println("\t< 극장 좌석 예약 시스템 >");
		while (true) {
			System.out.println("------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print((i + 1) + "  ");
			}
			System.out.println("\n------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println("\n------------------------------");
			System.out.print("예매하실 좌석 번호를 입력(종료:0)-> ");
			int input = sc.nextInt();
			// 0번을 입력하면 종료
			if (input == 0) {
				System.out.println("예매 시스템을 종료합니다.");
				break;
			}
			// 예매 상태확인
			if (seat[input - 1] == 0) { // 0이면 예매 가능 좌석
				count++;
				seat[input - 1] = 1; // 예매 완료
				System.out.println(input + "번의 예매가 완료되었습니다.");

			} else {
				System.out.println(input + "번은 이미 예매가 된 자리입니다.");
				System.out.println("다른 자리를 선택해주세요.");
			}

		} // while
		System.out.println("총 지불 금액은 " + count * 7000 + "원 입니다.");
	}

}
