package hywoo;

class Car {
	String name;
	String color;
	boolean gasoline;

	Car(String name, String color, boolean gasoline) {
		this.name = name;
		this.color = color;
		this.gasoline = gasoline;
	}

	void run() {
		if (gasoline) {
			System.out.println("부릉 부릉");
		} else {
			System.out.println("덜컹 덜컹");
		}
	}

	void stop() {
		System.out.println("끼이익");
	}
}

class Truck extends Car {
	int ton;

	Truck(String name, String color, boolean gasoline, int ton) {
		super(name, color, gasoline);
		this.ton = ton;
	}

	void run() {
		System.out.println("우당탕 쿵탕");
	}

	void convey() {
		System.out.println("짐을 실어 나른다.");
	}

}

public class Main {
	public static void TestCar(Car car) {
		car.run();
		car.stop();
		if (car instanceof Truck) {
			.((Truck) car).convey();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Car arCar[] = { 
				new Car("그랜저", "검정", true),
				new Truck("포터", "파랑", false, 1500),
				new Car("쏘나타", "노랑", true) 
				};

		for (Car i : arCar)
			TestCar(i);
	}
}