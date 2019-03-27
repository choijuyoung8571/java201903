package java05;

import javax.swing.JOptionPane;

public class CalTest {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("숫자1 입력");
		String num2 = JOptionPane.showInputDialog("숫자2 입력");
		
		int n1 = Integer.parseInt(num1); // num1을 int로 바꿀수 있는지 분석
		int n2 = Integer.parseInt(num2);
		
		JOptionPane.showMessageDialog(null, n1 + n2); // 다이얼로그로 출력할 때 - showMessageDialog
		
		int result = JOptionPane.showConfirmDialog(null, n1+n2);
		System.out.println(result);
		
		// 반환받을 값이 있으면 return
		// 반환받을 값이 없으면 void
	}

}
