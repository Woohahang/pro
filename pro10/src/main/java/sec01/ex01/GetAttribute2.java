package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletContext; // 웹 애플리케이션 (pro10)
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/get")
public class GetAttribute2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		ServletContext context = getServletContext();
//		context.getContextPath();

		ServletContext context = getServletContext();
		System.out.println(context.getContextPath()); // 아! 얘는 pro10 이구나! 콘솔에 /pro10 찍힘
		HttpSession sess = request.getSession();

		String ctxMsg = (String) context.getAttribute("context");
		String sessMsg = (String) sess.getAttribute("session");
		String requestMsg = (String) request.getAttribute("request");
		
		System.out.println("");
		System.out.println(ctxMsg);
		System.out.println(sessMsg);
		System.out.println(requestMsg);
	}

}
