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
	// main함수가 static이기에 전역변수를 사용하려면 static붙여줘야해, 하지만 static은 메모리를 많이 차지하기에 사용 자제
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
	static int mewin = 0; //내가 이긴 횟수
	static int computerwin = 0; //컴퓨터가 이긴 횟수
	static int nowin = 0; // 무승부 횟수
	

	public static void main(String[] args) {
		// 1. 화면
		// 2. 액션 처리
		
		JFrame f = new JFrame();
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\cjy\\java08\\rock.png"));
		f.setTitle("\uB098\uC758 \uAC00\uC704\uBC14\uC704\uBCF4 \uAC8C\uC784");
		f.setSize(800, 500);
		
		intro = new JTextField();
		intro.setFont(new Font("나눔고딕", Font.BOLD, 20));
		intro.setText("\uAC00\uC704 \uBC14\uC704 \uBCF4 \uAC8C\uC784\uC744 \uC2DC\uC791\uD569\uB2C8\uB2E4. \uC6D0\uD558\uB294 \uBC84\uD2BC\uC744 \uB20C\uB7EC\uC8FC\uC138\uC694.");
		f.getContentPane().add(intro, BorderLayout.NORTH);
		intro.setColumns(10);
		
		result = new JTextField();
		result.setBackground(Color.PINK);
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 25));
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
				f.setTitle("나의 가위바위보 게임(총 게임 횟수:"+count+"회)");
				// 가위를 눌렀을 때 실행될 코드
				System.out.println("가위를 선택하셨군요.");
				int me = 0; // 위에서 가위는 0이라고 전역변수로 선언했기 때문에
				Random random = new Random();
				int computer = random.nextInt(3); // 컴퓨터는 랜덤하게 0,1,2 중에서 낸다.
				if (computer == me) { // 컴퓨터가 s(가위)
					nowin++;
					result.setText("무승부!");
				} else if (computer == r) { // 컴퓨터가 r(주먹)
					computerwin++;
					result.setText("컴퓨터 승리!");
				} else { //컴퓨터가 p(보자기)
					mewin++;
					result.setText("내가 승리!");
				}
				intro.setText("내가 승리한 횟수:"+mewin+"회, 컴퓨터가 승리한 횟수:"+computerwin+"회, 무승부 횟수:"+nowin+"회");
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\cjy\\java08\\sciss.png"));
		btnNewButton.setBackground(Color.RED);
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 바위를 눌렀을 때 실행될 코드
				count++;
				f.setTitle("나의 가위바위보 게임(총 게임 횟수:"+count+"회)");
				System.out.println("바위를 선택하셨군요.");
				int me = 1; 
				Random random = new Random();
				int computer = random.nextInt(3); 
				if (computer == me) { 
					nowin++;
					result.setText("무승부!");
				} else if (computer == p) { // 컴(보) > 나(바위)
					computerwin++;
					result.setText("컴퓨터 승리!");
				} else { // 컴(가위) < 나(바위)
					mewin++;
					result.setText("내가 승리!");
				}
				intro.setText("내가 승리한 횟수:"+mewin+"회, 컴퓨터가 승리한 횟수:"+computerwin+"회, 무승부 횟수:"+nowin+"회");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\cjy\\java08\\rock.png"));
		btnNewButton_1.setBackground(Color.BLACK);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 보자기를 눌렀을 때 실행될 코드
				count++;
				f.setTitle("나의 가위바위보 게임(총 게임 횟수:"+count+"회)");
				System.out.println("보자기를 선택하셨군요.");
				int me = 0; 
				Random random = new Random();
				int computer = random.nextInt(3); 
				if (computer == me) { 
					nowin++;
					result.setText("무승부!");
				} else if (computer == r) { // 컴(주먹) < 나(보)
					result.setText("내가 승리!");
					mewin++;
				} else { // 컴(가위) > 나(보)
					computerwin++;
					result.setText("컴퓨터 승리!");
				}
				intro.setText("내가 승리한 횟수:"+mewin+"회, 컴퓨터가 승리한 횟수:"+computerwin+"회, 무승부 횟수:"+nowin+"회");
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\cjy\\java08\\paper.png"));
		btnNewButton_2.setBackground(Color.BLUE);
		panel.add(btnNewButton_2);
		
		f.setVisible(true);
	}

}
