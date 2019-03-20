package input;

import java.util.Scanner;

public class InputStart1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요...");
		String name = sc.next();
		System.out.println("당신의 이름은 "+name);
	}

}
