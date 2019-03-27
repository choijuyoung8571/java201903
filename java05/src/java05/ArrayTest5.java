package java05;

import javax.swing.JOptionPane;

public class ArrayTest5 {

	public static void main(String[] args) {
		// 빈 배열을 만들고 다이얼로그로 배열값을 입력받아 출력
		String[] names = new String[3];
		
		
		names[0] = JOptionPane.showInputDialog("이름 입력");
		names[1] = JOptionPane.showInputDialog("이름 입력");
		names[2] = JOptionPane.showInputDialog("이름 입력");
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		
	}

}
