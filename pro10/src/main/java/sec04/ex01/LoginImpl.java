package sec04.ex01;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class LoginImpl implements HttpSessionListener {

	String user_id;
	String user_pw;
	static int total_user = 0;

	public LoginImpl() {

	}

	public LoginImpl(String user_id, String user_pw) {
		this.user_id = user_id;
		this.user_pw = user_pw;
	}

	// 세션이 만들어졌을 때 코드를 쳐라
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("세션 생성, 어떤 고객(클라이언트) 들어옴");
		++total_user;
	}

	// 세션이 들어왔을 때 코드를 쳐라!!
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("세션 소멸, 어떤 고객(클라이언트) 빠져나감");
		--total_user;

	}

}
