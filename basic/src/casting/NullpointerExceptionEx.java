package casting;

public class NullpointerExceptionEx {
	public static void main(String[] args) {
		
		Object obj = null;
		obj = "hi";
//		System.out.println(obj.toString()); // 투 스트링에 넣은걸 스트링이 참조해서 ㅇㅇ?
		
		String str = null;

		

//		예외 처리 코드 패턴
//		예외가 발생 할 수 있으니 한 번 시도해바라 (try)
//		예외가 날 경우 잡아라 (catch)
	
		try {
//			예외 발생 가능성 있는 코드
			System.out.println(str.toString());
		}catch(Exception e) {
//			예외가 났을 경우 대비하는 코드
			System.out.println("문자열의 값이 저장되지 않았어요.");
			
			e.printStackTrace();
		};
				
		
		
	}
}
