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

		JFrame f = new JFrame("나의 생성자 프레임");
		f.setSize(404, 399);
		f.setVisible(true);

		// 1. 레이아웃 변경 -> FlowLayout
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		// 2. 레이블 생성 -> 프레임에 add
		JLabel label = new JLabel();
		f.getContentPane().add(label);

		// 3. 이미지 생성 -> 레이블에 add
		ImageIcon icon = new ImageIcon("diary.png");
		label.setIcon(new ImageIcon("C:\\Users\\cjy\\Desktop\\choijy\\java11\\diary.PNG"));

		// 4. ID, PW 생성 - 프레임에 add
		JLabel id = new JLabel("ID 입력: ");
		JTextField idText = new JTextField(10);
		JLabel pw = new JLabel("PW 입력: ");
		JTextField pwText = new JTextField(10);
		f.getContentPane().add(id);
		f.getContentPane().add(idText);
		f.getContentPane().add(pw);
		f.getContentPane().add(pwText);

		// 5. 버튼 생성 -> 프레임에 add
		JButton button = new JButton("로그인");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 로그인 버튼
				String inputId = idText.getText();
				String inputPw = pwText.getText();
				if ((inputId.equals(oriId)) && (inputPw.equals(oriPw))) {
					System.out.println("로그인 OK");
					Diary diary = new Diary();
				} else {
					System.out.println("로그인 NO");
				}
			}
		});
		f.getContentPane().add(button);

	}

}
