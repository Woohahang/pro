package inputEx;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1_1 {

	public static void main(String[] args) {

		// try catch with resource 구문 사용시 안 닫아도 된다.
		try (FileInputStream fis = new FileInputStream("D:/ex/text02.txt")) {
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		}catch (Exception e) {
			System.out.println("파일 경로 일치하지 않는다.");
		}

	}

}
