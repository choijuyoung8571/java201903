import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class InputImage2 {

	public static void main(String[] args) {

		// 프레임 설정
		JFrame f = new JFrame();
		f.setTitle("나의 그림2");
		f.setSize(700, 700);

		// 기본 레이아웃은 동,서,남,북,가운데 순서이기에
		// 순서대로 넣어주는 flowLayout이라는 레이아웃 사용
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		// 버튼 생성
		JButton button = new JButton();
		f.add(button);

		// 이미지 불러오기
		// 경로를 알려주지 않으면 java07 안에서 해당 이미지를 찾는다.
		ImageIcon icon = new ImageIcon("ham.jpg");
		// 버튼에 이미지 삽입
		button.setIcon(icon);

		// 실행시키기
		f.setVisible(true);

	}

}
