package oop;

public class Bus {
	int busNumber; // 버스 번호
	int passengerCount; // 승객 수
	int money; // 수입

	Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	void take(int money) {
		this.money += money;
	}
	
	void showInfo() {
		System.out.println("현재 버스 회사 수입은" + money);
	}

}
