package 공부;

public class 바이트를_스트링생성자에보내기 {
	public static void main(String[] args) {

//		char arr[] = new char[3];
//		arr[0] = 'h';
//		arr[1] = 'i';
//		arr[2] = '3';

//		System.out.println(arr);


		byte[] a = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String string = new String(a);
						// 스트링의 하나의 매개변수를 받는 생성자에 보낸거다.
						// 스트링 컨트롤 해서 마우스 가져다대고 오픈 임포메이션으로 생성자 확인해보면 이해하기 쉽다.

		System.out.println(string);
	// 위 과정을 배운 이유 : 통신에서는 바이트로 데이터륿 보낸다고 함	

	}
}
