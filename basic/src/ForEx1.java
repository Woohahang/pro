import java.util.Iterator;

public class ForEx1 {

	public static void main(String[] args) {

//		1 부터 10 까지 찍기
//		int tot = 0;
//		for (int i = 1; i <= 10; i++) {
//			tot += i;
//		}
//		System.out.println(tot);

//	1부터 100 사이 홀수 찍기
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 1) System.out.println(i);
//		}

		// 1부터 100 사이 3의 배수 누적합 구하기
//		int tot = 0;
//		for (int i = 0; i < 100; i++) {
//			if (i % 3 == 0)	tot += i;
//			}
//		System.out.println(tot);

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%2d X%2d =%2d  ", i, j, i * j);
			}
			System.out.println();
		}
		
		
//		5x * 7y = 50 이 되는 모든 해을 구해라.

	}
}
