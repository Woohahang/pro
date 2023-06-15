package chapter05;

import java.util.Calendar;

public class WeekEx {
	public static void main(String[] args) {
		Week today = null;

		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

		System.out.println(Week.Saturday);

		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1: {
			today = Week.Sunday;
			break;
		}
		case 2: {
			today = Week.Monday;
			break;
		}
		case 3: {
			today = Week.Tuesday;
			break;
		}

//			System.out.println("오늘은");
		}

	}
}
