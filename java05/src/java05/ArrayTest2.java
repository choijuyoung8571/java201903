package java05;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] friends = {"�达", "�̾�", "�ھ�", "�־�"};
		
		System.out.println(friends.length); // �迭�� ���̸� �˷���
		
		// foreach�� : for���� �����ϰ� (0���� �����ؼ� �迭�� ���̱��� +1�� �����ϴ� for��)
		for (String f : friends) {
			System.out.println(f);
		}
		
		for (int i=0; i < friends.length; i++) {
			System.out.println("���� ģ���� "+friends[i]);
		}
		
		
		
	}

}
