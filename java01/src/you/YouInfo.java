package you;

public class YouInfo {

	public static void main(String[] args) {
		// 친구에 대한 정보 입력 : 
		int height = 180; // int 4byte
		// 같은 정수인데 byte는 크기가  1/4만 차지
		// byte baby = 100;
		// 실수형 float(4bye), double(8byte)
		double eye = 1.5;
		float weight = 50.5f;
		char gender = '여'; // char 2byte
		boolean lastTime = true; // boolean 1byte
		
		System.out.println("내 친구의 키는 " +height+ "cm");
		System.out.println("내 친구의 시력은 "+eye);
		System.out.println("내 친구의 성별은 "+gender);
		
		
	}

}
