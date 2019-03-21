package switchTest;

public class SwitchTest1 {

	public static void main(String[] args) {
		int num = 100;
		
		switch (num) {
		case 100 :
			System.out.println("100이 들어있습니다.");
			break;
		case 200:
			System.out.println("200이 들어있습니다.");
			break;
		case 300:
			System.out.println("300이 들어있습니다.");
			break;
		default:
			System.out.println("무슨 숫자인지 모르겠어요.");
		}
	}

}
