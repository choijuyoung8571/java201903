public class ArrayTest7 {

	public static void main(String[] args) {
		// 변수를 복사.
		int num = 100;
		int num2 = num;

		// 배열을 복사.
		int[] num3 = { 1, 2, 3 };

		// 얕은 복사 
		int[] num4 = num3;

		num3[0] = 100;
		
		for (int n3 : num3) {
			System.out.print(n3 + " ");
		}

		System.out.println();
		
		for (int n4 : num4) {
			System.out.print(n4 + " ");
		}
		
		System.out.println("\n--------");

		// 깊은 복사
		int[] num5 = num3.clone();
		num3[0] = 200;
		
		for (int n3 : num3) {
			System.out.print(n3 + " ");
		}
		
		System.out.println();
		
		for (int n5 : num5) {
			System.out.print(n5+" ");
		}
		
		
	} // main

} // class






