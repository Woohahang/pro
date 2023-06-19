package chapter09;

class Exercise9_7_indexOf는해당값이없으면마이너스1반환 {
	public static boolean contains(String src, String target) {
		return src.indexOf(target) != -1;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
		
		System.out.println("12345".indexOf("8"));
// 인덱스 오브가 해당 값이 없으면 -1을 반환 한다.
	}
}
