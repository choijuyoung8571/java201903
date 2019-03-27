package java05;

import javax.swing.JOptionPane;

public class DialogTest {

	public static void main(String[] args) {
		/* 
			// 입력 - 다이얼로그
			String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요."); // 입력할 다이어로그를 보여달라.
			// 출력 - 콘솔
			System.out.println("당신이 입력한 이름은 "+name); 
		*/
		
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요.");
		String sosok = JOptionPane.showInputDialog("당신의 소속을 입력하세요.");
		
		System.out.println("당신의 이름은: "+name);
		System.out.println("당신의 나이는: "+age);
		System.out.println("당신의 소속은: "+sosok);
		
		
	}

}
