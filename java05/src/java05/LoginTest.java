package java05;

import javax.swing.JOptionPane;

public class LoginTest {

	public static void main(String[] args) {
		String id2 = "root";
		String pw2 = "abcd";
		
		String id = JOptionPane.showInputDialog("ID 입력:");
		String pw = JOptionPane.showInputDialog("PW 입력:");
		// String은 기본형이 아니기 때문에 비교연산자로 비교 불가 -> String 비교할 수 있는 메소드 사용
		if (id.equals(id2) && pw.equals(pw2)) {
			System.out.println("로그인 OK");
		} else {
			System.out.println("로그인 NOT");
		}
		
	}

}
