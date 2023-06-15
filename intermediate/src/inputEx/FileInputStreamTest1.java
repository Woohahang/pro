package inputEx;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("D:/ex/test.txt");
//			System.out.print(fis);

			int i;
			while ( (i = fis.read() ) != -1) { // read로 파일을 읽는 경우 파일의 끝에 도달하면 -1을 반환
				System.out.print((char) i);
			}

		} catch (Exception e) {
			System.out.println("파일 경로가 잘못 되었거나, 파일명이 틀림");
//			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
