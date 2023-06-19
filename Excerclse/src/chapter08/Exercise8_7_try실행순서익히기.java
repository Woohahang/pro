package chapter08;

class Exercise8_7_try실행순서익히기 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b)
				System.exit(0);
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true); // 상단 1이 실행 되고 다음 System.exit(0); 이 코드가 걍 실행을 중단하겠다는 거
//		method(false);
	} // main
}