package anonymous;

import interfaceEx1.RemoteController;

public class Anonymous {

	// 필드
	// RemoteController field; // 인터페이스 타입이므로 객체를 만들 수 없다.
	// 구현한 클래스가 필드에 접근하게 해야함. 그런데 구현 클래스를 긴밀하게 만들고자 할 경우 익명 클래스를 선언해서 객체를 만들 수 있다/

	RemoteController field = new RemoteController() {
		// 여기 안이 익명 클래스다.
		// 인터페이스인데 익명의 클래스를 만든거임
		@Override
		public void turnoff() {

		}

		@Override
		public void turnOn() {

		}

		@Override
		public void setVolume(int volume) {

		}
	};

	// 생성자

	// 메서드

	void method1() {
		RemoteController localVar = new RemoteController() {
			// 이것 또한 인터페이스니까 객체 생성 못 함
			// 그래서 익명 클래스를 만든거임 아래는 new 띄어쓰기 자동완성 ㄷㄷ;

			@Override
			public void turnoff() {
				System.out.println("오디오 켬");

			}

			@Override
			public void turnOn() {
				System.out.println("오디오 끔");
			}

			@Override
			public void setVolume(int volume) {

			}
		};

		// 로컬 변수 사용 가능해졌다
		localVar.turnoff();

	}

	void method2(RemoteController remocon) {
		remocon.turnOn();
		remocon.turnoff();
	}

}
