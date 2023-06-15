package oop;

public class Student {
	String studentName;
	int grade;
	int money;

	Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	void takeBus(Bus bus) {
		bus.take(1500);
		this.money -= 1500;
	}

	void takeSubway(Subway subway) {
		subway.take(1000);
		this.money -= 1000;
	}

	void showInfo() {
		System.out.println(studentName + "학생의 남은 돈" + money);
	}
}
