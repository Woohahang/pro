package promotionEx;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

// 
public class PromotionEx {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		// b,c,d,e 는 A에 들어간다.
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		// 들어가진다
		B b1 = d;
		C c1 = e;

//		B b3 = e; // 상속 관계가 아니여서 에러
//		C c2 = d;
	}
}
