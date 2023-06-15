package sec03.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L; // 직렬화를 위한 코드

	public void init(ServletConfig config) throws ServletException {
		System.out.println("LoginServlt 객체 만들어짐");
	}

	public void destroy() {
		System.out.println("LoginServlet 객체 소멸");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_id=request.getParameter("user_id");
		String user_pd=request.getParameter("user_pd");

		
		System.out.println(user_id);
		System.out.println(user_pd);
	}
	
	

}
