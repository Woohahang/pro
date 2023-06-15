package staticEx;

public class Student1 {
	// 필드
	static int serialNum = 1000;
	int studentID;
	private String studentName;
	int grade;

	// 생성자
	public Student1() {
		serialNum++;
		studentID = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// 메서드

}
