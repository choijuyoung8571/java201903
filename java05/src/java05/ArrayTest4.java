package java05;

public class ArrayTest4 {

	public static void main(String[] args) {
		// ºó ¹è¿­·Î ¸¸µé±â
		String[] names = new String[3]; // ¹è¿­ÀÇ Å©±â ÁöÁ¤ -> String[Å©±â]
		
		names[0] = "±è¾¾";
		names[1] = "ÀÌ¾¾";
		names[2] = "¹Ú¾¾";
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		
	}

}
