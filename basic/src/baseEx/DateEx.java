package baseEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString());

		String str = date.toString();
		System.out.println(str);

		System.out.println("=========");

		// 간단한 날짜 포맷으로 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy mm");
		System.out.println(sdf);
		
		// toString 객체가 가지고 있는 값을 문자열로 바꿔준다.
		System.out.println(sdf.toString());
		// format 데이터를 문자로 바꿔준다.
		System.out.println(sdf.format(date));

		
		
		
	}
}
