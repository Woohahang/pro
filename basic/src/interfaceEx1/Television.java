package interfaceEx1;

public class Television implements RemoteController, Searchable {

	int volume;

	boolean mute;

	@Override
	public void turnOn() {
		System.out.println("TV 켠다.");
	}

	@Override
	public void turnoff() {
		System.out.println("TV 껐다.");
	}

	@Override
	public void setVolume(int volume) {

		if (volume > RemoteController.MAX_VOLUME) {
			this.volume = RemoteController.MAX_VOLUME;
		} else if (volume < RemoteController.MIN_VOLUME) {
			this.volume = RemoteController.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨 : " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "를 검색");
	}

	@Override
	public void setMute(boolean mute) {

//		RemoteController.super.setMute(mute);
		if (mute) {
			System.out.println("TV 무음 처리");
		}

	}

}
