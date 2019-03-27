import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SecondWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setTitle("\uB098\uC758 \uBA54\uB274\uD310");
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\cjy\\java08\\ham.jpg"));
		f.setBackground(Color.YELLOW);
		f.setSize(702, 587);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		btnNewButton.addActionListener(new ActionListener() {
			
			// 버튼을 눌렀을때 취해질 액션의 코딩이 들어갈 자리
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("버튼을 눌렀군요.");
			}
		});
		btnNewButton.setFont(new Font("돋움체", Font.BOLD, 15));
		btnNewButton.setToolTipText("\uB0B4\uAC00 \uBCF4\uC774\uB098\uC694??");
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("햄버거 버튼을 누르셨군요!");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\cjy\\java08\\ham2.jpg"));
		f.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 실행하기
		f.setVisible(true);
	}

}
