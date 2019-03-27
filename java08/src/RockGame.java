import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class RockGame {
	// main�Լ��� static�̱⿡ ���������� ����Ϸ��� static�ٿ������, ������ static�� �޸𸮸� ���� �����ϱ⿡ ��� ����
	private static JTextField intro;
	private static JTextField result;
	private static JPanel panel;
	private static JButton btnNewButton;
	private static JButton btnNewButton_1;
	private static JButton btnNewButton_2;
	static int s = 0;
	static int r = 1;
	static int p = 2;
	static int count = 0;
	static int mewin = 0; //���� �̱� Ƚ��
	static int computerwin = 0; //��ǻ�Ͱ� �̱� Ƚ��
	static int nowin = 0; // ���º� Ƚ��
	

	public static void main(String[] args) {
		// 1. ȭ��
		// 2. �׼� ó��
		
		JFrame f = new JFrame();
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\cjy\\java08\\rock.png"));
		f.setTitle("\uB098\uC758 \uAC00\uC704\uBC14\uC704\uBCF4 \uAC8C\uC784");
		f.setSize(800, 500);
		
		intro = new JTextField();
		intro.setFont(new Font("�������", Font.BOLD, 20));
		intro.setText("\uAC00\uC704 \uBC14\uC704 \uBCF4 \uAC8C\uC784\uC744 \uC2DC\uC791\uD569\uB2C8\uB2E4. \uC6D0\uD558\uB294 \uBC84\uD2BC\uC744 \uB20C\uB7EC\uC8FC\uC138\uC694.");
		f.getContentPane().add(intro, BorderLayout.NORTH);
		intro.setColumns(10);
		
		result = new JTextField();
		result.setBackground(Color.PINK);
		result.setForeground(Color.RED);
		result.setFont(new Font("����", Font.BOLD | Font.ITALIC, 25));
		result.setText("\uC544\uC9C1 \uAC8C\uC784 \uC2DC\uC791 \uC804 \uC785\uB2C8\uB2E4.");
		f.getContentPane().add(result, BorderLayout.SOUTH);
		result.setColumns(10);
		
		panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				f.setTitle("���� ���������� ����(�� ���� Ƚ��:"+count+"ȸ)");
				// ������ ������ �� ����� �ڵ�
				System.out.println("������ �����ϼ̱���.");
				int me = 0; // ������ ������ 0�̶�� ���������� �����߱� ������
				Random random = new Random();
				int computer = random.nextInt(3); // ��ǻ�ʹ� �����ϰ� 0,1,2 �߿��� ����.
				if (computer == me) { // ��ǻ�Ͱ� s(����)
					nowin++;
					result.setText("���º�!");
				} else if (computer == r) { // ��ǻ�Ͱ� r(�ָ�)
					computerwin++;
					result.setText("��ǻ�� �¸�!");
				} else { //��ǻ�Ͱ� p(���ڱ�)
					mewin++;
					result.setText("���� �¸�!");
				}
				intro.setText("���� �¸��� Ƚ��:"+mewin+"ȸ, ��ǻ�Ͱ� �¸��� Ƚ��:"+computerwin+"ȸ, ���º� Ƚ��:"+nowin+"ȸ");
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\cjy\\java08\\sciss.png"));
		btnNewButton.setBackground(Color.RED);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������ ������ �� ����� �ڵ�
				count++;
				f.setTitle("���� ���������� ����(�� ���� Ƚ��:"+count+"ȸ)");
				System.out.println("������ �����ϼ̱���.");
				int me = 1; 
				Random random = new Random();
				int computer = random.nextInt(3); 
				if (computer == me) { 
					nowin++;
					result.setText("���º�!");
				} else if (computer == p) { // ��(��) > ��(����)
					computerwin++;
					result.setText("��ǻ�� �¸�!");
				} else { // ��(����) < ��(����)
					mewin++;
					result.setText("���� �¸�!");
				}
				intro.setText("���� �¸��� Ƚ��:"+mewin+"ȸ, ��ǻ�Ͱ� �¸��� Ƚ��:"+computerwin+"ȸ, ���º� Ƚ��:"+nowin+"ȸ");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\cjy\\java08\\rock.png"));
		btnNewButton_1.setBackground(Color.BLACK);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ���ڱ⸦ ������ �� ����� �ڵ�
				count++;
				f.setTitle("���� ���������� ����(�� ���� Ƚ��:"+count+"ȸ)");
				System.out.println("���ڱ⸦ �����ϼ̱���.");
				int me = 0; 
				Random random = new Random();
				int computer = random.nextInt(3); 
				if (computer == me) { 
					nowin++;
					result.setText("���º�!");
				} else if (computer == r) { // ��(�ָ�) < ��(��)
					result.setText("���� �¸�!");
					mewin++;
				} else { // ��(����) > ��(��)
					computerwin++;
					result.setText("��ǻ�� �¸�!");
				}
				intro.setText("���� �¸��� Ƚ��:"+mewin+"ȸ, ��ǻ�Ͱ� �¸��� Ƚ��:"+computerwin+"ȸ, ���º� Ƚ��:"+nowin+"ȸ");
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\cjy\\java08\\paper.png"));
		btnNewButton_2.setBackground(Color.BLUE);
		panel.add(btnNewButton_2);
		
		f.setVisible(true);
	}

}
