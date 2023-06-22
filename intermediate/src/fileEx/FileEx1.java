package fileEx;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {

		File file = new File("D:/ex/home.jpg");
		File filetest = new File("D:/ex/homsssdasahkjhweajkhe");

		System.out.println(file.getName()); // 파일명만 가지고 온다. 
		System.out.println(file.getPath());

		System.out.println(filetest.getName()); // 이름 대충 해도 되네?
	}
}
