package array;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {

	public static void main(String[] args) {
		// �������� ��Ÿ���� class�� �ִ�. -> JFrame
		JFrame f = new JFrame();
		f.setTitle("���� ù �׷��� ���α׷�");
		f.setSize(500, 500); // ũ�� ���� 
		
		// button ����� -> JButton
		JButton button = new JButton();
		button.setText("���� ������!");
		f.add(button); // �����ӿ� ��ư�� ����
		
		// ��ư �ϳ� ��!
		JButton button2 = new JButton();
		button2.setText("���� �� ������!");
		f.add(button2);
		
		// �ٸ� ���̾ƿ����� ��ư�� �ְڴ�!
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// ��� ������ �ϰ� �� �������� ���
		f.setVisible(true); // ����ش޶�! 
		
	}

}
