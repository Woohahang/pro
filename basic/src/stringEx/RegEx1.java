package stringEx;

import java.util.regex.Pattern;

public class RegEx1 {

	public static void main(String[] args) {

		String regEx = "(02|010)-\\d{3}-\\d{4}"; // 이건 크롬에 정규표현식 사이트에서 아래 테스트 스트링에 정보 적고 어떻게 찾을지 복붙한거다.
		String data = "010-123-4567";

		System.out.println(Pattern.matches(regEx, data)); // 패턴 매치란 정규식과 일치하면 트루를 반환한다.
		
		boolean b =	Pattern.matches(regEx, data);
		
		if(b) System.out.println("정규표현식 일치");
		else System.out.println("정규표현식 불일치");

	}

}
