package java05;

import javax.swing.JOptionPane;

public class DialogTest {

	public static void main(String[] args) {
		/* 
			// �Է� - ���̾�α�
			String name = JOptionPane.showInputDialog("����� �̸��� �Է��ϼ���."); // �Է��� ���̾�α׸� �����޶�.
			// ��� - �ܼ�
			System.out.println("����� �Է��� �̸��� "+name); 
		*/
		
		String name = JOptionPane.showInputDialog("����� �̸��� �Է��ϼ���.");
		String age = JOptionPane.showInputDialog("����� ���̸� �Է��ϼ���.");
		String sosok = JOptionPane.showInputDialog("����� �Ҽ��� �Է��ϼ���.");
		
		System.out.println("����� �̸���: "+name);
		System.out.println("����� ���̴�: "+age);
		System.out.println("����� �Ҽ���: "+sosok);
		
		
	}

}
