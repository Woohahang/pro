package instanceofEx;

import java.util.ArrayList;

public class AnimalTest {

	ArrayList<Animal> animalList = new ArrayList<Animal>();

	public static void main(String[] args) {
		AnimalTest aniTest = new AnimalTest();

		aniTest.addAnimal();
		aniTest.testCasting();
	}

	void addAnimal() {
		animalList.add(new Human2());
		animalList.add(new Tiger());
		animalList.add(new Eagle());

	}

	void testCasting() {
		for (Animal animal : animalList) {
			if (animal instanceof Human2) {
				Human2 human2 = (Human2) animal;
				human2.move();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.move();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.move();
			} else {
				System.out.println("지원되지 않은 타입");
			}
		}
	}

}
