package variable;

public class VarTest {
	/*
	 *프로그래머 : 최주영
	 *최종 수정 날짜 : 2019.3.19
	 *수정 원인 : 변수 확인
	 */
	
	public static void main(String[] args) {
		// 자바의 기본 주석 (1줄 주석)
		System.out.println("오늘은 두번째 날입니다.");
		System.out.println("-----------------");
		System.out.println(); // Enter 한번 넣어줘
		
		byte time = 15;// = 대입 연산자, 할당 연산자
					   // 데이터타입 변수명 = 값;
		int seconds = 51245315;
		final double PI = 3.14123457; // final -> 상수 (변하지 않는 값, 변경 불가한 값)(이런 경우에 암묵적으로 변수명은 대문자로 사용)
		// PI = 3; -> 상수값인데 3.14가 아닌 다른 값을 넣으면 error
		
		char lastName = '최';
		boolean lunch = true; // 참 : true, 거짓 : false
		// println에서  + 는 연결 연산자
		System.out.println("지금 시각은 " + time);
		System.out.println("아침부터 지난 초는" + seconds);
		System.out.println("pi의 값은" + PI);
		System.out.println("나의 성은 " + lastName);
		System.out.println("점심을 먹었나요?" + lunch);
		
		String name = "김아무개"; // String -> ""(이중따옴표사용)
		System.out.println("나의 전체 이름은 " + name);
	}

}
