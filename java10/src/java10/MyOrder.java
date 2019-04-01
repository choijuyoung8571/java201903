package java10;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyOrder {
	private static JTextField count;
	private static JTextField price;
	static int number = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("\uC8FC\uBB38 \uD504\uB85C\uADF8\uB7A8");
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\cjy\\Desktop\\choijy\\java10\\jajang.PNG"));
		f.setSize(642, 457);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("C:\\Users\\cjy\\Desktop\\choijy\\java10\\11.PNG"));
		
		JButton b1 = new JButton("\uC9DC\uC7A5\uBA74");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Â¥Àå¸é ¹öÆ° 
				ImageIcon icon = new ImageIcon("jajang.png");
				img.setIcon(icon);
				number++;
				count.setText(number+"");
				price.setText((number*5000)+"");
			}
		});
		b1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("\uC9EC\uBF55");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Â«»Í ¹öÆ°
				ImageIcon icon = new ImageIcon("jambong.png");
				img.setIcon(icon);
				number++;
				count.setText(number+"");
				price.setText((number*5000)+"");
			}
		});
		b2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("\uD0D5\uC218\uC721");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ÅÁ¼öÀ° ¹öÆ°
				ImageIcon icon = new ImageIcon("tangsu.png");
				img.setIcon(icon);
				number++;
				count.setText(number+"");
				price.setText((number*5000)+"");
			}
		});
		b3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		f.getContentPane().add(b3);
		
		JLabel lblNewLabel = new JLabel("\uAC2F\uC218");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		f.getContentPane().add(lblNewLabel);
		
		count = new JTextField();
		f.getContentPane().add(count);
		count.setColumns(6);
		
		JLabel lblNewLabel_1 = new JLabel("\uAE08\uC561");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		f.getContentPane().add(lblNewLabel_1);
		
		price = new JTextField();
		f.getContentPane().add(price);
		price.setColumns(6);
		
		f.getContentPane().add(img);
		
		f.setVisible(true);

	}

}
