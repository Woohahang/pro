package stringEx;

public class Ex1 {

	public static void main(String[] args) {
		String str = "자바 프로그래밍";

		// 이거 안 된다
//		for (int i = 0; i < str.isBlank(); i++) {
//			System.out.println(str);
//		}

//		System.out.println(str.indexOf("뉅")); // 찾고자 하는 값이 없으면 -1 왜? 걍 문법 약속

//		System.out.println(str.indexOf("자바"));

//		System.out.println(str.replace("자", "바"));

		System.out.println(str.charAt(3));
		
		
	}

}
