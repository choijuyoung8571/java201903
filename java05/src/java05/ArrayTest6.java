package java05;

import javax.swing.JOptionPane;

public class ArrayTest6 {

	public static void main(String[] args) {
		// �� �迭�� ����� ���̾�α׷� �迭���� �Է¹޾� ���
		// ArrayTest5.java��  �����ϰ� ���� �ڵ�
		String[] names = new String[3];
		
		// �Է� - ���̾�α�
		for (int i = 0; i < names.length; i++) {
			names[i] = JOptionPane.showInputDialog("�̸� �Է�");
		}
		// ��� - �ܼ�
		for (int i = 0; i < names.length; i++) {
			// System.out.println(names[i]);
			if(names[i].equals("�ھƹ���")) {
				System.out.println("�ھƹ����� �ֽ��ϴ�.");
				System.out.println((i+1)+"��° �ֽ��ϴ�.");
			} 
	
		}
	
	}

}
