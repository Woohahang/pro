package inheritance;

public class Human extends Mammal {

	public Human() {

	}

	// 오버라이드는 재정의다.
	@Override // 골뱅이란 어노테이션 즉, 주석 즉, 컴파일러에게 요건 오버라이딩이다! 알려준 주석! 알아서 에러 잡아라!으이
	void breathe() {
//		super.breathe();
		System.out.println("코로 숨쉰다.");
	}
}
