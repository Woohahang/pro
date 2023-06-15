package sec03.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/sess")
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
//		System.out.println(session);
//		System.out.println(session.isNew());
//		System.out.println(session.getId());	
		
//		System.out.println(session.getMaxInactiveInterval());
//		session.setMaxInactiveInterval(3); // 3초마다 갱신된다
		System.out.println(session.isNew());
		System.out.println(session.getId());

		session.invalidate(); // 세션 소멸시킴
//		System.out.println(session.isNew()); // 그래서 이건 에러떠버림 session 이라는 객체를 소멸 시켜버려서 불러올 수가 없다.
//		System.out.println(session.getId()); 
	}

}
