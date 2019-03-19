// package -> import -> class
package control;
// java.lang은 기본값이라 쓰지않아도 내장
import java.lang.*; // java안에 lang안에 있는 부품들을 쓰겠다.
import java.util.Date;


public class ObjectTest {

	public static void main(String[] args) {
		Date date = new Date(); // 부품 복사 (부품명은 대문자)
		// Date를 복사해서 이름을 다르게 변수로 지정해주는데, 변수명 앞에 type를 넣는데 원래의 Date와 같은 거라는 의미로 type 대신에 Date 입력
		int hour = date.getHours(); // date.getHours가 받아온 숫자를 hour에 저장
		System.out.println("현재 시각은 " + hour);
		int min = date.getMinutes();
		System.out.println("현재 분은 " + min);
		int sec = date.getSeconds();
		System.out.println("현재 초는 "+ sec);
		int mon = date.getMonth();
		System.out.println("이번 달은 "+mon);
		int year = date.getYear();
		System.out.println("이번 년도는 "+ year);
		// 변수로 안넘겨주고 바로 출력
		System.out.println(date.getDay());
		System.out.println("이번달은 "+(date.getMonth()+1));
		System.out.println("이번년도는 "+(date.getYear()+1900)); // 1900년도를 기준으로 만들어서 +1900을 해줘야해
	
		
	}
}
