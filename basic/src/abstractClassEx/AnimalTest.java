package abstractClassEx;

public class AnimalTest {
	public static void main(String[] args) {
//		new Animal();
		// 애니멀이라는 타입을 인스턴스 할 수 없다!! 객체화 할 수 없다! 왜? 추상 클래스여서

		Dog dog = new Dog();
		dog.sound();

		Cat cat = new Cat();
		cat.sound();

		System.out.println("==============");

		Animal animal = null;
		animal = new Dog();
		animal.sound();

		animal = new Cat();
		animal.sound();

		System.out.println("==============");
		animalSound(new Dog());
		animalSound(dog);
		animalSound(new Cat());
	}

	static void animalSound(Animal animal) {
		animal.sound();
	}
}
