package chapter08;

public class Test {
	public static void main(String[] args) {

		try {
			System.out.println(3 / 0);
		} catch (Exception e) {
			System.out.println("예외 발생하면 이거 출력해라.");
		} finally {
			System.out.println("이거 나오면 아래 안나오나?");
		}

		System.out.println(" 이거 안나오나?");
		
	}
}
