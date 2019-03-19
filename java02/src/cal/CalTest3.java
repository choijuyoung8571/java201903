package cal;

public class CalTest3 {

	public static void main(String[] args) {
		// String id = "root";  비교연산자 사용불가 -> 비교 연산자는 기초형 비교만 할 수 있다. (String은 기초형 x)
		int id = 1000;
		int pw = 1111;
		/*
		 	if(조건) {
				조건이 맞으면 여기 실행..
			} else {
				조건이 안맞으면 여기 실행..
			}
		 */
		if (id==1000 && pw==1111) { 
			// 비교연산자의 결과는 맞으면, boolean
			System.out.println("로그인 허락...ok");
		}else {
			System.out.println("로그인 실패...no");
		}
		
		
		
	}
}