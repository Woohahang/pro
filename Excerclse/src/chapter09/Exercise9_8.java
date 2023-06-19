package chapter09;
// 문제
// 주어진 값을 반올림하여 소수점 이하 자리의 값을 반환한다 : , n .
// 예를 들어 의 값이 이면 소수점 째 자리에서 반올림하여 소수점 이하 자리의 n 3 , 4 3 수를 반환한다.

class Exercise9_8 {
	public static double round(double d, int n) {
		return Math.round(d * Math.pow(10, n)) / Math.pow(10, n);
	}

	public static void main(String[] args) {
		System.out.println(round(3.1415, 1));
//		System.out.println(round(3.1415, 2));
//		System.out.println(round(3.1415, 3));
//		System.out.println(round(3.1415, 4));
		System.out.println(round(3.1415, 5));
		
		
//		System.out.println(round(3.1415, 3));
//		System.out.println(Math.pow(2, 3));
	}
}

//Math.round(값);
//메소드 사용시 값을 소수점 첫째 자리 까지 반올림 해준다.

//Math.pow(2, 3);
//제곱을 계산해주는 함수
