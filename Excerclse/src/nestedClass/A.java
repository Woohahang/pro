package nestedClass;

public class A {

	// 이런걸 중첩(nested) 클래스 라고 한다.
	class B {
	}

	void method() { // 이런걸 로컬 클래스 라고 한다.
		class C { }
	}

	// 이런걸 중첩(nested) 인터페이스 라고 한다.
	interface BB { }

}