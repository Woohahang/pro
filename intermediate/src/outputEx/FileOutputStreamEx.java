package outputEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		try {
//			FileOutputStream fos = new FileOutputStream("D:/ex/hello2.txt");

//			fos.write(65);

			FileInputStream fis = new FileInputStream("D:/ex/hello2.txt");

			int ch = fis.read();
			System.out.println((char) ch);

		} catch (IOException e) {
			System.out.println("파일 쓰기 중 예외 발생");
		}
	}
}
