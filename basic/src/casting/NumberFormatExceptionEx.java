package casting;

public class NumberFormatExceptionEx {
	public static void main(String[] args) {

		// Wrapper ( 감싸다 : 기본형 객체를 감싸서 참조형으로 ) Integer 를 이용해서
		// 숫자 형태의 문자열인 경우 Integer.parse // parse란, 구문(문장의 구조), 문법 해석해라 즉, 문자를 숫자로 바꿔준다.

//		System.out.println(Integer.parseInt("100") + 1);

//		int res = Integer.parseInt("100") + 2;
//		System.out.println(res);

		int res2;
		try {
			res2 = Integer.parseInt("100") + 2;
			System.out.println(res2);

		} catch (Exception e) {
			System.out.println("예외 발생");
		}
		
//		System.out.println(res2);
		

	}
}
