package outputEx;

import java.io.FileOutputStream;

public class FileOutputStreamEx2 {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("D:/ex/hello3.txt")) {

			fos.write(65);
			fos.write(66);
			fos.write(67);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
