import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InputImage {

	public static void main(String[] args) {
		
		// ������ ���� 
		JFrame f = new JFrame();
		f.setTitle("���� �׸�");
		f.setSize(700, 700);

		// �ٷ� �׸��� ���� �� ����, ��ư�̳� ���� �־ �� �ڸ��� �̹����� ����ִ� ��� ����
		JLabel l = new JLabel();
		f.add(l);
		
		// �̹��� �ҷ�����
		ImageIcon icon = new ImageIcon("ham.jpg"); // ��θ� �˷����� ������ java07 �ȿ��� �ش� �̹����� ã�´�.
		l.setIcon(icon);
		
		// �����Ű��
		f.setVisible(true);
		
	}

}
