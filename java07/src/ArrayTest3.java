import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[][] seat = new int[2][5]; // 2행 5열에 해당하는 2차원 배열 생성
		System.out.println("< 영화 예매 프로그램입니다. >");
		System.out.println();

		// 무한루프 생성
		while (true) {
			for (int i = 0; i < 5; i++) {
				System.out.print("   " + i + "열");
			}
			System.out.println();
			System.out.println("-----------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + "행: ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "   ");
				} // 안for
				System.out.println();
			} // 밖for
			System.out.println("-----------------------");

			// 원하는 좌석 입력
			Scanner sc = new Scanner(System.in);
			System.out.print("예매 시작은 y, 종료는 x :");
			String input = sc.next();
			if (input.equals("x")) {
				System.out.println("예매 프로그램을 종료합니다.");
				System.out.println("안녕히가세요.");
				break;
			} else {
				System.out.print("예매하실 좌석의 행 입력: ");
				int row = sc.nextInt();
				System.out.print("예매하실 좌석의 열 입력: ");
				int col = sc.nextInt();
				
				// 예매 가능 여부 판단 if문
				if (seat[row][col] == 0) {
					System.out.println(row + "행 " + col + "열 예매가 완료되었습니다.");
					seat[row][col] = 1;
				} else {
					System.out.println("이미 예매완료된 좌석입니다.");
					System.out.println("다른 좌석을 선택해주세요.");
				}
				
			} // else
			
		} // while

	} // main

} // class
