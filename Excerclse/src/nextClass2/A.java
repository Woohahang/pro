package nextClass2;

class A {
	A() {
		System.out.println("A 객체가 생성 됨");
	}

	// 인스턴스 멤버 클래스 - 인스턴스란 스태틱이 안 붙은걸 말함
	class B {
		int field1;
		static int field2;

		public B() {
			System.out.println("B 객체가 생성");
		}

		void method1() {
//			System.out.println("class B 안에 method1");
			System.out.println(field1);
		}

		static void method1_1() {

		}
	}

	// 정적 멤버 클래스
	static class C {
		int field1;
		static int field2;

		public C() {
			System.out.println("C 객체 생성");
		}

		void method1() {
			System.out.println("C클래스 - method1");
		}

		static void method1_1() {

		}
	}

	// 로컬 클래스
	void method() {
		class D {
			int field1;

			D() {

			}

			void method1() {
				System.out.println("D클래스 - method1");
			}
		}

		D d = new D();
		d.field1 = 15;
		d.method1();

	}

}