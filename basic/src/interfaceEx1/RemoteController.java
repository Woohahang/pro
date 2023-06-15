package interfaceEx1;

// 설계도에서 상위 어느 범위에 해야한다. 규제나 가이드 역할 같은 접점 역할 느낌
public interface RemoteController {

	// 상수
	// public final static int MAX_VOLUME = 10; 당분간 다 쓰기 결국 같은거임 디폴트로 이게 다 있음
	public final static int MAX_VOLUME = 10;

	public final static int MIN_VOLUME = 0;

	// 추상 메서드 // 일단 tv를 껐다 켰다? x 껐다 켰다만 구현하는거임
	public abstract void turnOn(); // public abstract 생략 되어 있다. 컴파일 과정에서 붙게 된다.

	public abstract void turnoff();

	public abstract void setVolume(int volume);

	// 디폴트
	public default void setMute(boolean mute) {
		System.out.println("무음 해제");
		if (mute)
			System.out.println("무음 처리");
	}

	// 정적 메서드
	public static void changeBattery() {
		System.out.println("건전지 교체");
	}

}