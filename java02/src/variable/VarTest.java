package variable;

public class VarTest {
	/*
	 *���α׷��� : ���ֿ�
	 *���� ���� ��¥ : 2019.3.19
	 *���� ���� : ���� Ȯ��
	 */
	
	public static void main(String[] args) {
		// �ڹ��� �⺻ �ּ� (1�� �ּ�)
		System.out.println("������ �ι�° ���Դϴ�.");
		System.out.println("-----------------");
		System.out.println(); // Enter �ѹ� �־���
		
		byte time = 15;// = ���� ������, �Ҵ� ������
					   // ������Ÿ�� ������ = ��;
		int seconds = 51245315;
		final double PI = 3.14123457; // final -> ��� (������ �ʴ� ��, ���� �Ұ��� ��)(�̷� ��쿡 �Ϲ������� �������� �빮�ڷ� ���)
		// PI = 3; -> ������ε� 3.14�� �ƴ� �ٸ� ���� ������ error
		
		char lastName = '��';
		boolean lunch = true; // �� : true, ���� : false
		// println����  + �� ���� ������
		System.out.println("���� �ð��� " + time);
		System.out.println("��ħ���� ���� �ʴ�" + seconds);
		System.out.println("pi�� ����" + PI);
		System.out.println("���� ���� " + lastName);
		System.out.println("������ �Ծ�����?" + lunch);
		
		String name = "��ƹ���"; // String -> ""(���ߵ���ǥ���)
		System.out.println("���� ��ü �̸��� " + name);
	}

}
