package ifTest;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¥������Դϴ�~!!!");
		System.out.println("-----------------------------------------");
		System.out.println("�޴��� ������.");
		System.out.println("-----------------------------------------");
		System.out.println("1)¥���[4000��]  2)«��[4500��]  3)�쵿[5000��]");
		System.out.println("-----------------------------------------");
		System.out.print("����� ������? >>> ");
		int choice = sc.nextInt();
		System.out.print("�ֹ� ������? >>> ");
		int count = sc.nextInt();
		
		String food = null;
		int price = 0;
		int jajang = 4000;
		int jambong = 4500;
		int woodong = 5000;
		if(choice == 1) {
			food = "¥���";
			price = count * jajang;
		} else if (choice == 2) {
			food = "«��";
			price = count * jambong;
		} else {
			food = "�쵿";
			price = count * woodong;
		}
		System.out.println("����� ������ "+food+"�Դϴ�.");
		System.out.println("�� ������ "+price+"�� �Դϴ�.");
		
		//�����̻� ���Ž�, 2000������
		if (price >= 10000) {
			System.out.println("���ι޾� �����Ͻ� �ݾ��� "+(price-2000)+"�� �Դϴ�.");
		} else {
			System.out.println("���� �̸� ���ŷ� �������� �Ұ� - �� ���� : "+price);
		}
		
		System.out.println("���ְ� �弼��~!!!");
	}

}
