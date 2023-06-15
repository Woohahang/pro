package chapter04;

public class Ex4_4 {
	public static void main(String[] args) {

		int i = 1;
		int num = 0;
		int s = 0;

		do {
			num = num + i;

			s = -(i++);

		} while (num <= 100);
		System.out.println(num);
		// 왜 안 돼
	}
}
