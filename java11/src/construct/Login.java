package construct;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	static String oriId = "root";
	static String oriPw = "1234";

	public static void main(String[] args) {

		JFrame f = new JFrame("���� ������ ������");
		f.setSize(404, 399);
		f.setVisible(true);

		// 1. ���̾ƿ� ���� -> FlowLayout
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		// 2. ���̺� ���� -> �����ӿ� add
		JLabel label = new JLabel();
		f.getContentPane().add(label);

		// 3. �̹��� ���� -> ���̺� add
		ImageIcon icon = new ImageIcon("diary.png");
		label.setIcon(new ImageIcon("C:\\Users\\cjy\\Desktop\\choijy\\java11\\diary.PNG"));

		// 4. ID, PW ���� - �����ӿ� add
		JLabel id = new JLabel("ID �Է�: ");
		JTextField idText = new JTextField(10);
		JLabel pw = new JLabel("PW �Է�: ");
		JTextField pwText = new JTextField(10);
		f.getContentPane().add(id);
		f.getContentPane().add(idText);
		f.getContentPane().add(pw);
		f.getContentPane().add(pwText);

		// 5. ��ư ���� -> �����ӿ� add
		JButton button = new JButton("�α���");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// �α��� ��ư
				String inputId = idText.getText();
				String inputPw = pwText.getText();
				if ((inputId.equals(oriId)) && (inputPw.equals(oriPw))) {
					System.out.println("�α��� OK");
					Diary diary = new Diary();
				} else {
					System.out.println("�α��� NO");
				}
			}
		});
		f.getContentPane().add(button);

	}

}
