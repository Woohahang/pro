package chapter09;

public class Exercise9_13_문자열찾기 {
	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
//		System.out.println(src);
//		System.out.println("aa " + stringCount(src, "aa") + "를 개 찾았습니다.");
		System.out.println("aabbccAA".indexOf("b", 0));
	}

	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}

	static int stringCount(String src, String key, int pos) {
//								"문자열"     "aa"        "0"
		int count = 0;
		int index = 0;
		if (key == null || key.length() == 0)
			return 0;
		while ((index = src.indexOf(key, pos)) != -1) {
			// "0"       ""
			count++;
			pos = index + key.length();
		}
		return count;
	}
}
