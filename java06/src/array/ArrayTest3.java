package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		// double[] eyes = new double[5]; // 시력을 모르면 빈 배열 생성
		// 시력을 아는 경우...
		double[] eyes = {2, 1.5, 0.8, 0.5, 1.2}; // 2라고 써도 type이 double이기에 2.0으로 변경
		System.out.println("배열의 크키는 "+eyes.length);
		eyes[0] = 1.7;
		
		String[] names = {"김씨", "이씨", "박씨","최씨", "정씨"};
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(names[i]+"의 시력은 "+eyes[i]);
		}
		
		/*
		for (double d : eyes) { // eyes배열의 값을 d에 저장해서 배열의 크기만큼 계속 출력 - foreach문
			System.out.println(d);
		}
		*/
		
		char[] grade = {'A', 'B', 'C', 'A', 'F'};
		for (int i = 0; i < grade.length; i++) {
			System.out.println(names[i]+"성적 : "+grade[i]);
		}
		
		
	}

}
