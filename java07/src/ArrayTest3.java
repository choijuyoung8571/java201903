import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		int[][] seat = new int[2][5]; // 2�� 5���� �ش��ϴ� 2���� �迭 ����
		System.out.println("< ��ȭ ���� ���α׷��Դϴ�. >");
		System.out.println();

		// ���ѷ��� ����
		while (true) {
			for (int i = 0; i < 5; i++) {
				System.out.print("   " + i + "��");
			}
			System.out.println();
			System.out.println("-----------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + "��: ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + "   ");
				} // ��for
				System.out.println();
			} // ��for
			System.out.println("-----------------------");

			// ���ϴ� �¼� �Է�
			Scanner sc = new Scanner(System.in);
			System.out.print("���� ������ y, ����� x :");
			String input = sc.next();
			if (input.equals("x")) {
				System.out.println("���� ���α׷��� �����մϴ�.");
				System.out.println("�ȳ���������.");
				break;
			} else {
				System.out.print("�����Ͻ� �¼��� �� �Է�: ");
				int row = sc.nextInt();
				System.out.print("�����Ͻ� �¼��� �� �Է�: ");
				int col = sc.nextInt();
				
				// ���� ���� ���� �Ǵ� if��
				if (seat[row][col] == 0) {
					System.out.println(row + "�� " + col + "�� ���Ű� �Ϸ�Ǿ����ϴ�.");
					seat[row][col] = 1;
				} else {
					System.out.println("�̹� ���ſϷ�� �¼��Դϴ�.");
					System.out.println("�ٸ� �¼��� �������ּ���.");
				}
				
			} // else
			
		} // while

	} // main

} // class
