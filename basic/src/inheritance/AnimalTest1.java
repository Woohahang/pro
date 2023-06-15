package inheritance;

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
		System.out.println("호랑이가 움직인다.");
	}
}

public class AnimalTest1 {
	String a;

	AnimalTest1(Animal a) {
		moveAnimal(a);
	}

	void moveAnimal(Animal args) {
		args.move();
	}

	public static void main(String[] args) {

		
		
		
	}
}