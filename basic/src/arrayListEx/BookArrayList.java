package arrayListEx;

import java.util.ArrayList;

public class BookArrayList {

	public static void main(String[] args) {
		// 사이즈 늘어나야되는 경우 객체 ArrayList 사용해야댐

		ArrayList<Book> library = new ArrayList<Book>();
		// 제너릭이다. 포괄적으로 타입을 정한다. 북타입만 들어가게 선언한다.

		// 방법 1.
//		library.add(new Book("태백산맥", "조정래"));

		// 방법 2.
		Book book1 = new Book("태백산맥", "조정래");
		library.add(book1);
		
		
		
		
	}
}
