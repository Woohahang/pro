package chapter04;

public class Ex4_15 {

	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0; // 목적 : 0이 아닐 때 까지 돌아라.

		while (tmp != 0) {
			result = result * 10 + tmp % 10;
			tmp /= 10;
		}

		if (number == result) {
			System.out.println(number + " . 는 회문수 입니다");
		} else {
			System.out.println(number + " .");
		}

	}

}
