package loginPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginClass extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("서버 시작");
	}

	public void destroy() {
		System.out.println("서버 종료");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String user_id = request.getParameter("user_id");
		String user_password = request.getParameter("user_password");

//		System.out.println(user_id);
//		System.out.println(user_password);

		PrintWriter out = response.getWriter();
		out.print(user_id + " 환영합니다.<body> </body>");

//		String[] sub = request.getParameterValues("subject");
//
//		for (String i : sub) {
//			System.out.println(i);
//		}

		Enumeration<String> enu = request.getParameterNames();
		// 열거형
//		System.out.println(enu);

		while (enu.hasMoreElements()) {
			String name = enu.nextElement();
			System.out.println(name);
			String[] values = request.getParameterValues(name);
			for (String value : values) {
				System.out.println(name + ": " + value);
			}
			System.out.println();
		}

	}
}
