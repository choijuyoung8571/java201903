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
		f.getContentPane().setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_1 = new JLabel("\uC22B\uC7901 >>");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("돋움", Font.BOLD, 18));
		f.getContentPane().add(label_1);
		
		n1 = new JTextField();
		n1.setFont(new Font("굴림", Font.PLAIN, 18));
		n1.setColumns(10);
		f.getContentPane().add(n1);
		
		JLabel label = new JLabel("\uC22B\uC7902 >>");
		label.setFont(new Font("돋움", Font.BOLD, 18));
		label.setForeground(Color.WHITE);
		f.getContentPane().add(label);
		
		n2 = new JTextField();
		n2.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(n2);
		n2.setColumns(10);
		
		JButton add = new JButton("\uB354\uD558\uAE30 \uC5F0\uC0B0");
		add.addActionListener(new ActionListener() {
			// 더하기 연산 버튼 클릭 후 실행 코드
			public void actionPerformed(ActionEvent e) {
				System.out.println("더하기 버튼을 누르셨군요.");
				String num1 = n1.getText(); // n1에 입력한 값 가져오기
				String num2 = n2.getText(); // n2에 입력한 값 가져오기
				System.out.println("입력한 숫자값1 : "+num1);
				System.out.println("입력한 숫자값2 : "+num2);
				
				int n11 = Integer.parseInt(num1); //num1을 분석해보고 int로 바꿀수 있으면 바꿔라
				int n22 = Integer.parseInt(num2); //num2를 분석해보고 int로 바꿀수 있으면 바꿔라
				int sum = n11 + n22;
				System.out.println("두 수를 더한 값은 "+sum);
				
				result.setText(sum+""); // 현재 sum은 int인데 기본값이 Text여야 하기때문에 +" "처리를 해주면 string으로 인식, 아니면 ToString을 이용하여 String으로 변환
				}
		});
		add.setForeground(Color.BLACK);
		add.setBackground(Color.YELLOW);
		add.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().add(add);
		
		JButton sub_1 = new JButton("\uBE7C\uAE30  \uC5F0\uC0B0");
		sub_1.setBackground(Color.RED);
		sub_1.addActionListener(new ActionListener() {
			// 빼기 연산 버튼 누른 후 실행 될 코드
			public void actionPerformed(ActionEvent e) {
				System.out.println("빼기 버튼을 누르셨군요.");
				String num1 = n1.getText(); // n1에 입력한 값 가져오기
				String num2 = n2.getText(); // n2에 입력한 값 가져오기
				System.out.println("입력한 숫자값1 : "+num1);
				System.out.println("입력한 숫자값2 : "+num2);
				int n11 = Integer.parseInt(num1);
				int n22 = Integer.parseInt(num2);
				int sub = n11 - n22;
				System.out.println("두 수의 차는 "+sub);
				result2.setText(sub+"");
				
			}
		});
		sub_1.setFont(new Font("굴림", Font.BOLD, 18));
		f.getContentPane().add(sub_1);
		
		result = new JTextField();
		result.setForeground(Color.RED);
		result.setBackground(Color.BLUE);
		result.setFont(new Font("궁서체", Font.BOLD, 36));
		f.getContentPane().add(result);
		result.setColumns(6);
		
		result2 = new JTextField();
		result2.setForeground(Color.RED);
		result2.setBackground(Color.BLUE);
		result2.setFont(new Font("궁서체", Font.BOLD, 36));
		f.getContentPane().add(result2);
		result2.setColumns(6);
		f.setTitle("\uB098\uC758 \uACC4\uC0B0\uAE30");
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\cjy\\java08\\cal.jpg"));
		f.setSize(318, 495);
		
		
		// 실행
		f.setVisible(true);
	}

}
