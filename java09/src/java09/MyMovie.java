package java09;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyMovie {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\cjy\\Desktop\\choijy\\java09\\s.PNG"));
		f.setTitle("\uB098\uC758 \uC601\uD654 \uC568\uBC94");
		f.setSize(602, 844);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\cjy\\Desktop\\choijy\\java09\\1.PNG"));
		
		
		JButton m1 = new JButton("\uB3C8");
		m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 영화 돈 버튼을 눌렀을 때 포스터를 라벨에 집어넣기
				ImageIcon icon = new ImageIcon("1.png");
				label.setIcon(icon);
			}
		});
		m1.setBackground(Color.PINK);
		f.getContentPane().add(m1);
		
		JButton m2 = new JButton("\uB364\uBCF4");
		m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 영화 덤보 버튼을 눌렀을때 포스터를 라벨에 집어넣기
				ImageIcon icon = new ImageIcon("2.png");
				label.setIcon(icon);
			}
		});
		m2.setBackground(Color.PINK);
		f.getContentPane().add(m2);
		
		JButton m3 = new JButton("\uADF9\uD55C\uC9C1\uC5C5");
		m3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 영화 극한직업 버튼을 눌렀을 때 포스터를 라벨에 집어넣기
				ImageIcon icon = new ImageIcon("3.png");
				label.setIcon(icon);
			}
		});
		m3.setBackground(Color.PINK);
		f.getContentPane().add(m3);
		
		f.getContentPane().add(label);
		
		f.setVisible(true);
	}

}
