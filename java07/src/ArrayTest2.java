
public class ArrayTest2 {

	public static void main(String[] args) {
		int[][] seat = new int[2][5]; // 2행 5열에 해당하는 2차원 배열 생성
		
		System.out.println(seat.length); // 2차원배열에서 길이를 찍으면 행의 길이만 출력
		System.out.println(seat[0].length); // 2차원 배열의 열을 찍고싶을 때
		
		// ★2차원 배열은 for문 2개 필요!★
		System.out.println("------------------");
		for (int i = 0; i < seat.length; i++) { //i=행(2번)
			for (int j = 0; j < seat[i].length; j++) { //j=열(5번)
				System.out.print(seat[i][j] + " ");
			} // 안for
			System.out.println();
		} // 밖for
		
	}

}
