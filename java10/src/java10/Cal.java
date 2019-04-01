package java10;

public class Cal {
	// 더하기
	public int add(int x, int y) {
		return x + y;
	}
	// 빼기
	public int sub(int x, int y) {
		return x - y;
	}
	// 곱하기
	public int mul(int price, int cnt) {
		return price * cnt;
	}
	// 나누기
	public int div(int sum, int person) {
		return sum / person;
	}
	public String welcome(String name) {
		return name;
	}
	public String point(String name, String point) {
		return name+"님의 포인트는 "+point+"점 입니다.";
	}
}
