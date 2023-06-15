package test01;

import java.io.IOException;
import java.io.PrintWriter; // PrintWriter : Prints formatted representations of objects to a text-output stream

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/NewFile")
public class SecondServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("SecondServlet 객체 생성할 때만 만들어진다.");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("고객의 서비스 요청이 들어옴");

		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter(); //
//		System.out.println(out);
//		out.println("hi");
//		out.print("hi");

		String html = "<body>hi<br>한글</body>";
//		html +="<head>";
//		html +="</head>";
//		html +="<body>";
//		html +="hi<br>nice";
//		html +="</body>";

		out.print(html);

	}

	@Override
	public void destroy() {
		System.out.println("SecondServlet 객체 소멸할 때만 만들어진다.");
	}
}
