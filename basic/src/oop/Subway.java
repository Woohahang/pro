package oop;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;

	Subway() {

	}

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	void take(int money) {
		this.money += money;
	}

	void showInfo() {
		System.out.println(lineNumber + "지하철 수입은" + money);
	}

}
