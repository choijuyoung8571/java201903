package array;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� ������� �迭 ����
		int[] eng = new int[3];
		int[] mat = new int[3];
		
		// 3�� �л��� ���� �Է¹ޱ�
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1)+"��° �л��� �������� �Է� :");
			eng[i] = sc.nextInt();
			System.out.print((i+1)+"��° �л��� �������� �Է� :");
			mat[i] = sc.nextInt();
		}
		
		// 3�� �л��� ����, ���� ���� ��� ���ϱ�
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 = sum1 + eng[i];
			sum2 = sum2 + mat[i];
		}
		// ��� ���
		System.out.println("3�� �л����� �������� ��� :"+sum1/3.0);
		System.out.println("3�� �л����� �������� ��� :"+sum2/3.0);
	}
}

