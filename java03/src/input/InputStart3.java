package input;

import java.util.Scanner;

public class InputStart3 {

	public static void main(String[] args) {
		
	// ���̸� �Է¹޾�, 18�� �̻��̸� ��������, 18�� �̸��̸� �̼������� ���
		System.out.print("���̸� �Է��ϼ���.>>>");
		Scanner sc2 = new Scanner(System.in);
		int age = sc2.nextInt();
		if(age >= 18) {
			System.out.println("�����̽ʴϴ�.");
		}else {
			System.out.println("�̼����̽ʴϴ�.");
		}
		
	}

}
