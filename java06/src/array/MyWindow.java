package array;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {

	public static void main(String[] args) {
		// 프레임을 나타내는 class가 있다. -> JFrame
		JFrame f = new JFrame();
		f.setTitle("나의 첫 그래픽 프로그램");
		f.setSize(500, 500); // 크기 설정 
		
		// button 만들기 -> JButton
		JButton button = new JButton();
		button.setText("나를 눌러요!");
		f.add(button); // 프레임에 버튼을 넣음
		
		// 버튼 하나 더!
		JButton button2 = new JButton();
		button2.setText("나를 또 눌러요!");
		f.add(button2);
		
		// 다른 레이아웃으로 버튼을 넣겠다!
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// 모든 설정을 하고 맨 마지막에 출력
		f.setVisible(true); // 출력해달라! 
		
	}

}
