package chapter08;

public class Exercise8_1 {
	public static void main(String[] args) {

		try {
			System.out.println(3 / 0);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("0을 나눌 수 없다.");
		}
		
	}
}
