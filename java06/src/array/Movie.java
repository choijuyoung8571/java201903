package array;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0; // ���� �ο� ���� ����
		int[] seat = new int[10]; // �ڸ��� ���� �迭

		System.out.println("\t< ���� �¼� ���� �ý��� >");
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
			System.out.print("�����Ͻ� �¼� ��ȣ�� �Է�(����:0)-> ");
			int input = sc.nextInt();
			// 0���� �Է��ϸ� ����
			if (input == 0) {
				System.out.println("���� �ý����� �����մϴ�.");
				break;
			}
			// ���� ����Ȯ��
			if (seat[input - 1] == 0) { // 0�̸� ���� ���� �¼�
				count++;
				seat[input - 1] = 1; // ���� �Ϸ�
				System.out.println(input + "���� ���Ű� �Ϸ�Ǿ����ϴ�.");

			} else {
				System.out.println(input + "���� �̹� ���Ű� �� �ڸ��Դϴ�.");
				System.out.println("�ٸ� �ڸ��� �������ּ���.");
			}

		} // while
		System.out.println("�� ���� �ݾ��� " + count * 7000 + "�� �Դϴ�.");
	}

}
