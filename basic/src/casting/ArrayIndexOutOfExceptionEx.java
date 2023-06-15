package casting;

public class ArrayIndexOutOfExceptionEx {
	public static void main(String[] args) {
		// 배열 예제를 치고 ArrayIndexOutOfExceptionEx가 발생하도록 예외처리

		int[] a = new int[2];

		try {
			System.out.println("테스트");
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}
}
