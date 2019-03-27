import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InputImage {

	public static void main(String[] args) {
		
		// 프레임 설정 
		JFrame f = new JFrame();
		f.setTitle("나의 그림");
		f.setSize(700, 700);

		// 바로 그림을 넣을 수 없고, 버튼이나 글을 넣어서 그 자리에 이미지를 집어넣는 방식 가능
		JLabel l = new JLabel();
		f.add(l);
		
		// 이미지 불러오기
		ImageIcon icon = new ImageIcon("ham.jpg"); // 경로를 알려주지 않으면 java07 안에서 해당 이미지를 찾는다.
		l.setIcon(icon);
		
		// 실행시키기
		f.setVisible(true);
		
	}

}
