import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class CalWindow {
	private static JTextField n2;
	private static JTextField n1;
	private static JTextField result;
	private static JTextField result2;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("����", Font.PLAIN, 18));
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_1 = new JLabel("\uC22B\uC7901 >>");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("����", Font.BOLD, 18));
		f.getContentPane().add(label_1);
		
		n1 = new JTextField();
		n1.setFont(new Font("����", Font.PLAIN, 18));
		n1.setColumns(10);
		f.getContentPane().add(n1);
		
		JLabel label = new JLabel("\uC22B\uC7902 >>");
		label.setFont(new Font("����", Font.BOLD, 18));
		label.setForeground(Color.WHITE);
		f.getContentPane().add(label);
		
		n2 = new JTextField();
		n2.setFont(new Font("����", Font.PLAIN, 18));
		f.getContentPane().add(n2);
		n2.setColumns(10);
		
		JButton add = new JButton("\uB354\uD558\uAE30 \uC5F0\uC0B0");
		add.addActionListener(new ActionListener() {
			// ���ϱ� ���� ��ư Ŭ�� �� ���� �ڵ�
			public void actionPerformed(ActionEvent e) {
				System.out.println("���ϱ� ��ư�� �����̱���.");
				String num1 = n1.getText(); // n1�� �Է��� �� ��������
				String num2 = n2.getText(); // n2�� �Է��� �� ��������
				System.out.println("�Է��� ���ڰ�1 : "+num1);
				System.out.println("�Է��� ���ڰ�2 : "+num2);
				
				int n11 = Integer.parseInt(num1); //num1�� �м��غ��� int�� �ٲܼ� ������ �ٲ��
				int n22 = Integer.parseInt(num2); //num2�� �м��غ��� int�� �ٲܼ� ������ �ٲ��
				int sum = n11 + n22;
				System.out.println("�� ���� ���� ���� "+sum);
				
				result.setText(sum+""); // ���� sum�� int�ε� �⺻���� Text���� �ϱ⶧���� +" "ó���� ���ָ� string���� �ν�, �ƴϸ� ToString�� �̿��Ͽ� String���� ��ȯ
				}
		});
		add.setForeground(Color.BLACK);
		add.setBackground(Color.YELLOW);
		add.setFont(new Font("����", Font.BOLD, 18));
		f.getContentPane().add(add);
		
		JButton sub_1 = new JButton("\uBE7C\uAE30  \uC5F0\uC0B0");
		sub_1.setBackground(Color.RED);
		sub_1.addActionListener(new ActionListener() {
			// ���� ���� ��ư ���� �� ���� �� �ڵ�
			public void actionPerformed(ActionEvent e) {
				System.out.println("���� ��ư�� �����̱���.");
				String num1 = n1.getText(); // n1�� �Է��� �� ��������
				String num2 = n2.getText(); // n2�� �Է��� �� ��������
				System.out.println("�Է��� ���ڰ�1 : "+num1);
				System.out.println("�Է��� ���ڰ�2 : "+num2);
				int n11 = Integer.parseInt(num1);
				int n22 = Integer.parseInt(num2);
				int sub = n11 - n22;
				System.out.println("�� ���� ���� "+sub);
				result2.setText(sub+"");
				
			}
		});
		sub_1.setFont(new Font("����", Font.BOLD, 18));
		f.getContentPane().add(sub_1);
		
		result = new JTextField();
		result.setForeground(Color.RED);
		result.setBackground(Color.BLUE);
		result.setFont(new Font("�ü�ü", Font.BOLD, 36));
		f.getContentPane().add(result);
		result.setColumns(6);
		
		result2 = new JTextField();
		result2.setForeground(Color.RED);
		result2.setBackground(Color.BLUE);
		result2.setFont(new Font("�ü�ü", Font.BOLD, 36));
		f.getContentPane().add(result2);
		result2.setColumns(6);
		f.setTitle("\uB098\uC758 \uACC4\uC0B0\uAE30");
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\cjy\\java08\\cal.jpg"));
		f.setSize(318, 495);
		
		
		// ����
		f.setVisible(true);
	}

}
