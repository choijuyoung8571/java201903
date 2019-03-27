package java05;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] friends = {"김씨", "이씨", "박씨", "최씨"};
		
		System.out.println(friends.length); // 배열의 길이를 알려줘
		
		// foreach문 : for문을 간단하게 (0부터 시작해서 배열의 길이까지 +1씩 증가하는 for문)
		for (String f : friends) {
			System.out.println(f);
		}
		
		for (int i=0; i < friends.length; i++) {
			System.out.println("나의 친구는 "+friends[i]);
		}
		
		
		
	}

}
