package java05;

import javax.swing.JOptionPane;

public class ArrayTest6 {

	public static void main(String[] args) {
		// 빈 배열을 만들고 다이얼로그로 배열값을 입력받아 출력
		// ArrayTest5.java를  간단하게 만든 코드
		String[] names = new String[3];
		
		// 입력 - 다이얼로그
		for (int i = 0; i < names.length; i++) {
			names[i] = JOptionPane.showInputDialog("이름 입력");
		}
		// 출력 - 콘솔
		for (int i = 0; i < names.length; i++) {
			// System.out.println(names[i]);
			if(names[i].equals("박아무개")) {
				System.out.println("박아무개가 있습니다.");
				System.out.println((i+1)+"번째 있습니다.");
			} 
	
		}
	
	}

}
