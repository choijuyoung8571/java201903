package java05;

import javax.swing.JOptionPane;

public class CalTest {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("����1 �Է�");
		String num2 = JOptionPane.showInputDialog("����2 �Է�");
		
		int n1 = Integer.parseInt(num1); // num1�� int�� �ٲܼ� �ִ��� �м�
		int n2 = Integer.parseInt(num2);
		
		JOptionPane.showMessageDialog(null, n1 + n2); // ���̾�α׷� ����� �� - showMessageDialog
		
		int result = JOptionPane.showConfirmDialog(null, n1+n2);
		System.out.println(result);
		
		// ��ȯ���� ���� ������ return
		// ��ȯ���� ���� ������ void
	}

}
