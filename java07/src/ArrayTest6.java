import java.util.Arrays;

public class ArrayTest6 {

	public static void main(String[] args) {
		int[] num = {12, 45, 85, 50, 87};
		Arrays.sort(num); // num[] �迭�� �����ش޶�.
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] == 50) {
				System.out.println((i+1)+"��");
			} //if
		} //for
		
		
	} //main

} //class
