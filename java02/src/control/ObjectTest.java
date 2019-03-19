// package -> import -> class
package control;
// java.lang�� �⺻���̶� �����ʾƵ� ����
import java.lang.*; // java�ȿ� lang�ȿ� �ִ� ��ǰ���� ���ڴ�.
import java.util.Date;


public class ObjectTest {

	public static void main(String[] args) {
		Date date = new Date(); // ��ǰ ���� (��ǰ���� �빮��)
		// Date�� �����ؼ� �̸��� �ٸ��� ������ �������ִµ�, ������ �տ� type�� �ִµ� ������ Date�� ���� �Ŷ�� �ǹ̷� type ��ſ� Date �Է�
		int hour = date.getHours(); // date.getHours�� �޾ƿ� ���ڸ� hour�� ����
		System.out.println("���� �ð��� " + hour);
		int min = date.getMinutes();
		System.out.println("���� ���� " + min);
		int sec = date.getSeconds();
		System.out.println("���� �ʴ� "+ sec);
		int mon = date.getMonth();
		System.out.println("�̹� ���� "+mon);
		int year = date.getYear();
		System.out.println("�̹� �⵵�� "+ year);
		// ������ �ȳѰ��ְ� �ٷ� ���
		System.out.println(date.getDay());
		System.out.println("�̹����� "+(date.getMonth()+1));
		System.out.println("�̹��⵵�� "+(date.getYear()+1900)); // 1900�⵵�� �������� ���� +1900�� �������
	
		
	}
}
