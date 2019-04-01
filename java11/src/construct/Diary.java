package construct;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Diary {
	private JTextField t1;
	private JTextField t2;
	
	public Diary() {
		JFrame f = new JFrame();
		f.setTitle("\uB098\uC758 \uC77C\uAE30\uC7A5");
		f.setSize(574,466);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel date = new JLabel("\uC77C\uAE30 \uC791\uC131 \uB0A0\uC9DC");
		date.setFont(new Font("±º∏≤", Font.BOLD, 29));
		f.getContentPane().add(date);
		
		t1 = new JTextField();
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC77C\uAE30 \uC791\uC131 \uC81C\uBAA9");
		lblNewLabel_1.setFont(new Font("±º∏≤", Font.BOLD, 29));
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC77C\uAE30 \uC791\uC131 \uB0B4\uC6A9");
		lblNewLabel_2.setFont(new Font("±º∏≤", Font.BOLD, 30));
		f.getContentPane().add(lblNewLabel_2);
		
		JTextArea t3 = new JTextArea();
		t3.setRows(10);
		t3.setColumns(50);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("\uD30C\uC77C \uC800\uC7A5\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ∆ƒ¿œ ¿˙¿Â«œ±‚ πˆ∆∞
				String date = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				System.out.println(date);
				System.out.println(title);
				System.out.println(content);
				try {
					FileWriter file = new FileWriter(date+".txt");
					file.write(date+"\n");
					file.write(title+"\n");
					file.write(content+"\n");
					file.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uD30C\uC77C \uBD88\uB7EC\uC624\uAE30");
		f.getContentPane().add(btnNewButton_1);
		
		
		f.setVisible(true);
	}
}
