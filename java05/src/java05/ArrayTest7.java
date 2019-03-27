package java05;

public class ArrayTest7 {

	public static void main(String[] args) {

		int[] score = {88, 77, 55, 44, 11, 66, 99};
		
		for (int i = 0; i < score.length; i++) {
			if(score[i] == 11) {
				System.out.println((i+1)+"번째 있습니다.");
			}
		}
		System.out.println("전체 리스트");
		for (int i = 0; i < score.length; i++) {
			System.out.println(i+" : "+score[i]);
		}
	}

}
