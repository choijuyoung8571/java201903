package whileTest;

import java.util.Random;
import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// ���ڸ� �����Ͽ� ���� ���ڸ� ���ߴ� ���α׷�
		Random random = new Random();
		int target = random.nextInt(100);
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while (true) {
		// �õ��� Ƚ�� ī��Ʈ
		count++;
		// ������ ���ڸ� �Է�
		System.out.print("������ ���ڸ� �Է� >>> ");
		int input = sc.nextInt();
		// ����� �� 
		if (input == target) {
			System.out.println("�����մϴ�.�����Դϴ�!!");
			break;
		} else {
			System.out.println("�ٽ� �Է��ϼ���...");
			// ������ڿ� ����  Hint!
			if (input > target) {
				System.out.println("�� ���� ���� �Է����ּ���.");
			} else {
				System.out.println("�� ū ���� �Է����ּ���.");
			} //else
		} //else
		
		} //while
		System.out.println("����� �õ��� Ƚ�� : "+count);
		
	} //main

} //class
