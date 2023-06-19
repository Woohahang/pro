package chapter09;

class Exercise9_10 {
	static String format(String str, int length, int alignment) {
// 1. length str length . 의 값이 의 길이보다 작으면 만큼만 잘라서 반환한다
		int diff = length - str.length();
		if (diff < 0)
			return str.substring(0, length);

// 2. 1 , length char . 의 경우가 아니면 크기의 배열을 생성하고 공백으로 채운다
		char[] source = str.toCharArray(); // char 문자열을 배열로 변환
		char[] result = new char[length];
		for (int i = 0; i < result.length; i++)
			result[i] = ' '; // result . 배열 를 공백으로 채운다

// 3. (alignment) (str) . 정렬조건 의 값에 따라 문자열 을 복사할 위치를 결정한다
		switch (alignment) {
		case 0:
		default:
			System.arraycopy(source, 0, result, 0, source.length);
			break;
		case 1:
			System.arraycopy(source, 0, result, diff / 2, source.length);
			break;
		case 2:
			System.arraycopy(source, 0, result, diff, source.length);
			break;
		}
// 4. 2 char . 에서 생성한 배열을 문자열로 만들어서 반환한다
		return new String(result);
	} // static String format(String str, int length, int alignment) {

	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0)); // 왼쪽 정렬
		System.out.println(format(str, 7, 1)); // 가운데 정렬
		System.out.println(format(str, 7, 2)); // 오른쪽 정렬
	}
}
