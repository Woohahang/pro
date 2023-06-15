package anonymous;

import interfaceEx1.RemoteController;

public class AnonymousEx {

	public AnonymousEx() {

	}

	// 메
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		// 익명 객체 필드 사용한거
		anony.field.turnOn();

		// 익명 객체 로컬 변수 사용할거
		anony.method1();

		anony.method2(new RemoteController() {

			@Override
			public void turnoff() {
				System.out.println("스마트 TV 끔");
			}

			@Override
			public void turnOn() {
				System.out.println("스마트 TV 켬");
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub

			}
		});
	}

}
