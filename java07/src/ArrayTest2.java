
public class ArrayTest2 {

	public static void main(String[] args) {
		int[][] seat = new int[2][5]; // 2�� 5���� �ش��ϴ� 2���� �迭 ����
		
		System.out.println(seat.length); // 2�����迭���� ���̸� ������ ���� ���̸� ���
		System.out.println(seat[0].length); // 2���� �迭�� ���� ������ ��
		
		// ��2���� �迭�� for�� 2�� �ʿ�!��
		System.out.println("------------------");
		for (int i = 0; i < seat.length; i++) { //i=��(2��)
			for (int j = 0; j < seat[i].length; j++) { //j=��(5��)
				System.out.print(seat[i][j] + " ");
			} // ��for
			System.out.println();
		} // ��for
		
	}

}
