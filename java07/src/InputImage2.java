import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class InputImage2 {

	public static void main(String[] args) {

		// ������ ����
		JFrame f = new JFrame();
		f.setTitle("���� �׸�2");
		f.setSize(700, 700);

		// �⺻ ���̾ƿ��� ��,��,��,��,��� �����̱⿡
		// ������� �־��ִ� flowLayout�̶�� ���̾ƿ� ���
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		// ��ư ����
		JButton button = new JButton();
		f.add(button);

		// �̹��� �ҷ�����
		// ��θ� �˷����� ������ java07 �ȿ��� �ش� �̹����� ã�´�.
		ImageIcon icon = new ImageIcon("ham.jpg");
		// ��ư�� �̹��� ����
		button.setIcon(icon);

		// �����Ű��
		f.setVisible(true);

	}

}
