package chapter10;

import java.text.*;
import java.util.*;

class Exercise10_1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2010, 0, 1); // cal 2010 1 1 . 의 날짜를 년 월 일로 설정한다
		for (int i = 0; i < 12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK); // 1 . 일의 요일을 구한다
// 1 . 두 번째 일요일은 일의 요일에 따라 달라진다
// 1 8 , 일이 일요일인 경우에는 두번째 일요일은 일이고
// 1 16 1 (weekday) . 일이 다른 요일일 때는 에서 일의 요일 을 빼면 알 수 있다
			int secondSunday = (weekday == 1) ? 8 : 16 - weekday;
// (secondSunday) cal (DAY_OF_MONTH) . 두 번째 일요일 로 의 날짜 를 바꾼다
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			Date d = cal.getTime(); // Calendar Date . 를 로 변환한다
			System.out.println(new SimpleDateFormat("yyyy-MM-dd F E 은 번째 요일입니다.").format(d));
// 1 . 날짜를 다음달 일로 변경한다
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
	}
}