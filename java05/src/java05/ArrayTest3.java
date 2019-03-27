package java05;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 취미 리스트 5개 담아서 출력!!
		String[] hobby = {"자기", "먹기", "놀기", "티비", "컴퓨터"};
		
		for (int i = 0; i < hobby.length; i++) {
			System.out.println(hobby[i]);
		}
		
		for (String hb : hobby) {
			System.out.println("나의 취미는 "+hb);
		}
		
	}

}
