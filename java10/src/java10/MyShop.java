package java10;

public class MyShop {

	public static void main(String[] args) {
		int milk = 2000;
		int coffee = 4000;
		int icecream = 3000;
		int bread = 5000;
		
		// 1. ���ǰ� ���
		Cal cal = new Cal();
		int total = cal.add(milk, coffee);
		
		// 2. ������ ���� : ��ü ���ұݾ�, �� ���� (-1000��) �� ���� �ݾ�
		System.out.println("��ü ���� �ݾ� :"+total+"��");
		System.out.println("�� ���� �� ���� �ݾ�:"+(total-1000)+"��");
		System.out.println("�����մϴ�. ������ �� �鷯�ּ���.");
		System.out.println("--------------------");
		
		// �� 2��, ���̽�ũ�� 3���� �� ����
		int b = cal.mul(bread, 2);
		int ice = cal.mul(icecream, 3);
		int sum = b + ice;
		System.out.println("��ü ���� �ݾ� :"+sum+"�� �Դϴ�.");
		
		// ��ġ���� �ϰ�ʹ�!
		int each = cal.div(sum, 5);
		System.out.println("�� ����� "+each+"���� ���� �˴ϴ�.");
		
		// �մ� ȯ�� ���� ���
		String name = cal.welcome("���ֿ�");
		System.out.println(name+"�� ȯ���մϴ�!");
		
		// �մ��̸��� ����Ʈ ���
		String point = cal.point("���ֿ�", "10000");
		System.out.println(point);
	}

}
