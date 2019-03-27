package java05;

public class ArrayTest {

	public static void main(String[] args) {
		int[] seat = {1, 2, 3, 4, 5}; // []-> 배열로 사용하겠다.
		
		for(int i=0; i < seat.length; i++) {
			System.out.println(seat[i]); 
		}
		System.out.println("-");
		
		System.out.println(seat[0]); // 배열의 첫번째
		System.out.println(seat[4]); // 배열의 마지막
		
		
	}

}
