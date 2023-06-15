package oop;

import java.sql.Date;

public class Member {

	// 필드(field) - 객체의 데이터가 저장되는 곳
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;

	public void setID(String id) {
		this.id = id;
	}

	public String getID() {
		return id;
	}

}
