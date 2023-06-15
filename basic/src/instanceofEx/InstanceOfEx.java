package instanceofEx;

public class InstanceOfEx {
	// 누가 누구 자식인지 알기 귀찮을 때 instanceof 쓰면 됨
	// 문법 // 객체 instanceof 타입 // 우측의 타입으로 객체가 생성 되면 true

	static void method1(Parent parent) {

		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("methoid1 - Child 변환성공");
		} else {
			System.out.println("methoid1 - Child 변환되지 않음");
		}
	}

	static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 에서 Child 변환 성공");
	}

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
//		method2(parentA);

		Parent parentB = new Parent();
		method1(parentB);
//		method2(parentB); // parent 객체를 매개값으로 전달하니 예외가 발생함.
	}
}
