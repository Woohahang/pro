package sec04.ex01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {


	//이 request는 first를 가져오라는 요청
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter  out=response.getWriter();
		
		 String str="menu";
		request.setAttribute(str, "noodle"); // binding(객체에 데이터를 묶음(저장)
//		System.out.println(request);
		System.out.println("request 범위에서" + str  +  "객체가 setting 됨");
		
//		response.sendRedirect("second");
		
		//첫 번째 request는 웹 브라우저를 통해 재요청되는 두번째 request와는 다른 요청임
		//redirect 방식으로는 서블릿에서 바이딩한  데이터를 다른 서블릿으로 전송할 수 없다.
	
		RequestDispatcher dispatcher=request.getRequestDispatcher("second");
		dispatcher.forward(request,response);
		
	}

}
