package java05;

public class ArrayTest3 {

	public static void main(String[] args) {
		// ��� ����Ʈ 5�� ��Ƽ� ���!!
		String[] hobby = {"�ڱ�", "�Ա�", "���", "Ƽ��", "��ǻ��"};
		
		for (int i = 0; i < hobby.length; i++) {
			System.out.println(hobby[i]);
		}
		
		for (String hb : hobby) {
			System.out.println("���� ��̴� "+hb);
		}
		
	}

}
