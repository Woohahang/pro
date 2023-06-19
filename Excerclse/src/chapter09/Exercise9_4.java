package chapter09;

class Exercise9_4 {
	static void printGraph(int[] dataArr, char ch) {
		for (int i = 0; i < dataArr.length; i++) { // 매개변수의 길이만큼 돌려라
			for (int j = 0; j < dataArr[i]; j++) { // 인덱스 만큼 반복해라
				System.out.print(ch); // 인덱스 만큼 별이 찍힌다.
			}
			System.out.println(dataArr[i]); // 인덱스 = 회전수의 수가 나온다.
		}
	}

	public static void main(String[] args) {
		printGraph(new int[] { 3, 7, 1, 4 }, '*');
	}
}