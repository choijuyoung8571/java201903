package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		// double[] eyes = new double[5]; // �÷��� �𸣸� �� �迭 ����
		// �÷��� �ƴ� ���...
		double[] eyes = {2, 1.5, 0.8, 0.5, 1.2}; // 2��� �ᵵ type�� double�̱⿡ 2.0���� ����
		System.out.println("�迭�� ũŰ�� "+eyes.length);
		eyes[0] = 1.7;
		
		String[] names = {"�达", "�̾�", "�ھ�","�־�", "����"};
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(names[i]+"�� �÷��� "+eyes[i]);
		}
		
		/*
		for (double d : eyes) { // eyes�迭�� ���� d�� �����ؼ� �迭�� ũ�⸸ŭ ��� ��� - foreach��
			System.out.println(d);
		}
		*/
		
		char[] grade = {'A', 'B', 'C', 'A', 'F'};
		for (int i = 0; i < grade.length; i++) {
			System.out.println(names[i]+"���� : "+grade[i]);
		}
		
		
	}

}
