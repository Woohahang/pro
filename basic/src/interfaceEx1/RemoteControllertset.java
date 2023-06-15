package interfaceEx1;

public class RemoteControllertset {

	public static void main(String[] args) {
//		new RemoteController(); // 타입인 이건 객체화 할 수 없다. 왜? 추상 타입이니까.

		RemoteController remocon; // 인터페이스 변수 선언

		remocon = new Television();
		remocon.turnoff();
		remocon.turnoff();
		
		remocon.setMute(true); // 인터페이스가 가지고 있는 기본 메서드 사용
		
		remocon = new Audio();
		
		remocon.turnOn();
		remocon.turnoff();
		remocon.setMute(true);
	}
}
