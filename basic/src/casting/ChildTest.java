package casting;

public class ChildTest {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";

		parent.method1();
		parent.method2();

//		parent.filed2;
//		parent.method3();

		// 요게 캐스팅
		Child child = (Child) parent;
		child.method3();

		// 지워도 됨
//		Child a = (Child) parent;
//		a.method3();

	}
}
