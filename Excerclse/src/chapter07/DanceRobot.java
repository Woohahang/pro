package chapter07;

class Exercise7_18 {

	public static void action(Robot r) {
		if (r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot) r;
			dr.dance();
		} else if (r instanceof SingRobot) {
			SingRobot sr = (SingRobot) r;
			sr.sing();
		} else if (r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot) r;
			dr.draw();
		}
	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		System.out.println("테스트");
		
		action(arr[1]);
		
//		for (int i = 0; i < arr.length; i++)
//			action(arr[i]);
		
	}
}

class Robot {

}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}