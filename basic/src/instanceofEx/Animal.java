package instanceofEx;

class Animal {

	void move() {
		System.out.println("동물이 움직인다.");
	}
}

class Human2 extends Animal {
	void move() {
		System.out.println("사람이 움직인다.");
	}
}

class Tiger extends Animal {
	void move() {
		System.out.println("호랑이가 네 발로 걸음");
	}
}

class Eagle extends Animal {

	public Eagle() {

	}

	void move() {
		System.out.println("독수리가 하늘을 난다.");
	}
}