package stringEx;

public class StringBuilderEx {
	public static void main(String[] args) {
		// buffer 버퍼란, 데이터를 임시로 저장하는 메모리.

		StringBuilder builder = new StringBuilder();
		System.out.println(builder);

		builder.append("java");

		builder.append("Program");

		System.out.println(builder);
		// 왜 위 과정처럼 문자열을 보내고 쓰냐?

		System.out.println("이렇게 바로 쓰면 되는거 아니냐?");
		// 할 수도 있지만, 시스템 아웃 프린트는 객체를 생성해서 만들고 뭐하고 뭐하는거라 메모리를 위에 방법 보다 더 잡아먹는다고 함.

		StringBuffer buffer = new StringBuffer();
		
		buffer.append("java");
		
		System.out.println(buffer);
		
	}
}
