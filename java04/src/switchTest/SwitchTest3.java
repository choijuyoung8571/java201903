package switchTest;

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ȸ�� ID�� �Է��ϼ���..>> ");
		String id = sc.next();
		// �Է¹��� ������ ���° ���ڸ� ������ �� -> charAt(index)
		char dept = id.charAt(0);
		
		switch (dept) {
		case 'i':
			System.out.println("IT�μ� �Դϴ�.");
			break;
		case'p':
			System.out.println("��ȹ�μ� �Դϴ�.");
			break;
		case's':
			System.out.println("Ư���μ� �Դϴ�.");
			break;
		default:
			System.out.println("�ش� �μ��� �����.");
		}
	
	}

}
