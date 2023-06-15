package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/first")
public class FirstServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();
		out.print("<body>this is first page</body>");

//		response.sendRedirect("second");

//      response.addHeader("Refresh", "5;url=second");
//      response.addHeader("Refresh", "1");
// 응답 헤더에게 이름과 값을 추가해서 해당되는 초 후에 화면을 refresh

//		out.print("<script>location.href='https://www.naver.com/'</script>");
//		out.print("<script>location.href='second'</script>");
//		out.print("<script>location.href='second'</script>");

//		response.sendRedirect("second?dasas=dsap");
//		response.sendRedirect("second?key=dd&xvcz=xzc");

//		String str = URLEncoder.encode("호랑이", "utf-8");
//		response.sendRedirect("second?key=" + str);

		RequestDispatcher dispatcher = request.getRequestDispatcher("second"); // 매개변수에 들어간 경로를 가지고 RequestDispatcher
																				// 객체를 반환
		dispatcher.forward(request, response);

	}

}