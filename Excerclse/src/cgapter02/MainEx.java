package cgapter02;

public class MainEx {
	public static void main(String[] args) {

//		char ch = 'B';

//		System.out.println(ch >= 'A' && ch <= 'Z');

//		int year = 400;

//		System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 != 0);

//		boolean powerOn = false;
//		System.out.println(!powerOn);
//		System.out.println(powerOn == false);

		String str = "yes";

		// 주소 값이 같은지 여부는 ==
		System.out.println(str == "yes");

		// 실제 문자열 값이 같을 경우 equals
		System.out.println(str.equals("yes"));

		int i = 0;
		int j = 0;
		while (i < 10) {

			while (j <= i) {
				System.out.println("*");
				j++;
			}
			i++;

		}
	}
}
