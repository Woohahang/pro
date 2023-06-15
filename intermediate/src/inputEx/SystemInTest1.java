package inputEx;

import java.util.Scanner;

public class SystemInTest1 {

	public static void main(String[] args) {
		// 한 글자 영어 읽는 법(read), 한 글자 한글 읽는 법 (Scanner), 한 줄은 (nextLine)
		
		try {
			Scanner sc = new Scanner(System.in);
			String oneLineKor = sc.nextLine();
			System.out.println(oneLineKor);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
